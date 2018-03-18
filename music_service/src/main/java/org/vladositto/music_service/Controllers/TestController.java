package org.vladositto.music_service.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.vladositto.music_service.Domain.Album;
import org.vladositto.music_service.Domain.Artist;
import org.vladositto.music_service.Domain.Song;
import org.vladositto.music_service.Services.AlbumService;
import org.vladositto.music_service.Services.ArtistService;
import org.vladositto.music_service.Services.SongService;

@Controller
//@SessionAttributes(value = { "login", "cart" })
public class TestController {
	@Autowired
	private SongService songService;
	@Autowired
	private AlbumService albumService;
	@Autowired
	private ArtistService artistService;

	@RequestMapping(value = "/top.do", method = RequestMethod.GET)
	public String showItems(Model model) {

//		Artist artist1 = new Artist("Dimiliri", "Ukraine", "Поп-группа, радующая глаз");
//		
//		Album album1 = new Album();
//		album1.setGenre("pop");
//		album1.setTitle("Вверх");
//		album1.setYear(2018);
//		
//		artist1.addAlbum(album1);
//		artistService.create(artist1);
//		
//		Song song1 = new Song();
//		song1.setTitle("Шаг вперед");
//		
//		album1.addSong(song1);
//		albumService.create(album1);
//		
//		songService.create(song1);
		
		List <Song> list;
		list = songService.getAllSong();
		
		model.addAttribute("songs", list);
		return "index"; // items
	}
}