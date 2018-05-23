package org.vladositto.music_service.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.vladositto.music_service.Domain.Album;
import org.vladositto.music_service.Domain.Artist;
import org.vladositto.music_service.Domain.Song;
import org.vladositto.music_service.Services.AlbumService;
import org.vladositto.music_service.Services.ArtistService;
import org.vladositto.music_service.Services.SongService;

@Controller
// @SessionAttributes(value = { "login", "cart" })
public class TestController {
	@Autowired
	private SongService songService;
	@Autowired
	private AlbumService albumService;
	@Autowired
	private ArtistService artistService;


	@RequestMapping(value = { "/{url}.do" }, method = RequestMethod.GET)
	public String showMainPage(Model model, @PathVariable("url") String url) {
		if (url.equals("")) {
			url = "top";
			model.addAttribute("url", url + ".do");
			return "redirect: /top.do";
		}
		model.addAttribute("url", url + ".do");
		return "index";
	}

	@RequestMapping(value = "/top.do", method = RequestMethod.POST)
	public String showItems(Model model) {

		List<Song> list;
		list = songService.getAllSong();

		model.addAttribute("songs", list);
		return "top"; // items
	}
	
	@RequestMapping(value = "/getHeader.do", method = RequestMethod.GET)
	public String getHeader( @RequestParam String login, Model model) {
		if (login.equals("")) {
			login = null;
		}
		model.addAttribute("login", login);
		return "header";
	}
}