package org.vladositto.music_service.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.vladositto.music_service.Domain.Song;
import org.vladositto.music_service.Services.SongService;

@Controller
//@SessionAttributes(value = { "login", "cart" })
public class TestController {
	@Autowired
	private SongService songService;

//	@ModelAttribute
//	public Cart createCart() {
//		return new Cart();
//	}

	@RequestMapping(value = "/items.do", method = RequestMethod.GET)
	public String showItems(Model model) {

		List<Song> list;
		list = songService.getAllSong();
		
		model.addAttribute("songs", list);
		return "index"; // items
	}
}