package org.vladositto.music_service.Controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.vladositto.music_service.Controllers.beans.RegistrationBean;
import org.vladositto.music_service.Domain.User;
import org.vladositto.music_service.Services.UserService;

@Controller
@SessionAttributes(value = { "login"})
public class UserController {
	 private static final String PARAM_LOGIN = "login";
	    private static final String PARAM_PWD1 = "pwd1";
	    private static final String PARAM_PWD2 = "pwd2";
	    private static final String PARAM_NAME = "name";
	    private static final String PARAM_MAIL = "email";
	    
	    @Autowired
	    private UserService userService;

		@RequestMapping(value="/login.do", method=RequestMethod.GET)
		public String loginGet(){
			return "login";
		}	
		
		@RequestMapping(value="/login.do", method=RequestMethod.POST)
		public String login(@RequestParam String login, @RequestParam String pwd, 
							@RequestHeader("Referer") String referer,
							HttpSession session,
							RedirectAttributes redirectAttributes){
	        if (userService.login(login, pwd)) {
	        	session.setAttribute("login", login);
	        	   if (userService.isAdmin(login)){
	               	session.setAttribute("admin", true);
	               } else{
	               	session.setAttribute("admin", false);
	               }
	        	return redirectBack(referer);
	        } else {
	        	redirectAttributes.addAttribute("error", 1);
	        	return "redirect:login";
	        }
		}
		@RequestMapping(value="/logout.do", method=RequestMethod.GET)
		public String logout(@RequestHeader("Referer") String referer, SessionStatus sessionStatus, 
							   @ModelAttribute("login") String login){
			sessionStatus.setComplete();
	    	return redirectBack(referer);
		}	
		
		@RequestMapping(value="/register", method=RequestMethod.GET)
		public String registerGet(RegistrationBean regBean, Model model){
			model.addAttribute("regForm", new RegistrationBean());
			return "register";
		}	
		
		@RequestMapping(value="/register.do", method=RequestMethod.POST)
		public String registerPost(Model model, RegistrationBean regBean, RedirectAttributes redirectAttributes){
	        Map<String, String> errors = validate(regBean);

	        if (errors.size() > 0) {
	        	regBean.setPassword1("");
	        	regBean.setPassword2("");
	        	model.addAttribute("errors", errors);
	        	model.addAttribute("regForm", regBean);
	            return "register";
	        }

	        userService.add(transformToDomain(regBean));

	        redirectAttributes.addAttribute("reg_success", 1);
			return "redirect:login";
		}	
		
		@RequestMapping(value="/profile.do", method=RequestMethod.GET)
		public String getProfile(HttpSession session, Model model) {
			if (session.getAttribute(PARAM_LOGIN)==null){
				return "redirect:login";
			}
			else{
				
				return "profile";
			}
		}
	    private Map<String, String> validate(RegistrationBean bean) {
	        Map<String, String> errors = new HashMap<String, String>();
	        validateString(bean.getLogin(), "\\w{2,16}", PARAM_LOGIN, errors);
	        validateString(bean.getPassword1(), "\\w{4,32}", PARAM_PWD1, errors);
	        validateString(bean.getName(), ".{2,32}", PARAM_NAME, errors);
	        validateString(bean.getEmail(), "\\w+@(\\w+[.])+\\w+", PARAM_MAIL, errors);
	        if (bean.getPassword1() != null && ! bean.getPassword1().equals(bean.getPassword2())){
	            errors.put(PARAM_PWD2, "Passwords are different!");
	        }
	        return errors;
	    }

	    private boolean validateString(String data, String pattern, String key, Map<String, String> map) {
	        if (data == null) {
	            map.put(key, "Parameter is empty");
	            return false;
	        }
	        if (! data.matches(pattern)) {
	            map.put(key, "Parameter has invalid value");
	            return false;
	        }
	        return true;
	    }

	    private User transformToDomain(RegistrationBean bean) {
	        User user = new User();
	        user.setLogin(bean.getLogin());
	        user.setPassword(bean.getPassword1());
	        user.setEmail(bean.getEmail());
	        user.setName(bean.getName());
	        return user;
	    }
		private String redirectBack(String referer){
	        //TODO Not so good solution )) Rather hack than good one.
	        if (referer != null && referer.contains("/login.do")) {
	        	return "redirect:/";
	        } else {
	        	return "redirect:"+referer;
	        }
		}

}
