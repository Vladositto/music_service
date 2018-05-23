package org.vladositto.music_service.Controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.vladositto.music_service.Controllers.beans.RegistrationBean;
import org.vladositto.music_service.Domain.Artist;
import org.vladositto.music_service.Domain.User;
import org.vladositto.music_service.Services.ArtistService;
import org.vladositto.music_service.Services.UserService;

@Controller
@SessionAttributes(value = { "login" })
public class AdminController {

	@Autowired
	private UserService userService;
	@Autowired
	private ArtistService artistService;

	@RequestMapping(value = "/admin.do", method = RequestMethod.POST)
	public String adminPageGet(@ModelAttribute("login") String login, Model model, Artist artist) {
		if (userService.isAdmin(login)) {
			model.addAttribute("createArtistForm", new Artist());
			return "admin";
		}
		return "forward:/login.do";
	}
	
	@RequestMapping(value = "/admin/songUpload.do", method = RequestMethod.POST)
	public String adminSongUpload(@ModelAttribute("login") String login, Model model) {
		if (userService.isAdmin(login)) {
			
		}
		return "forward:/login.do";
	}
	
	@RequestMapping(value = "/admin/createArtist.do", method = RequestMethod.POST)
	public String adminCreateArtist(@ModelAttribute("login") String login, @RequestParam String name, @RequestParam String bio,
			@RequestParam String country, Model model, Artist artist) {
		if (userService.isAdmin(login)) {
			artistService.create(artist);
			return "forward:/admin.do";
		}
		return "forward:/login.do";
	}

	

}
