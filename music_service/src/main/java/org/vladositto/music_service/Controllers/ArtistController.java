package org.vladositto.music_service.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.vladositto.music_service.Domain.Album;
import org.vladositto.music_service.Services.AlbumService;
import org.vladositto.music_service.Services.ArtistService;
import org.vladositto.music_service.Services.SongService;

@Controller
@SessionAttributes(value = { "login" })
public class ArtistController {

	@Autowired
	private SongService songService;
	@Autowired
	private AlbumService albumService;
	@Autowired
	private ArtistService artistService;

	@RequestMapping(value = { "/artist.do" }, method = RequestMethod.POST)
	public String showArtistPage(Model model, @RequestParam ("artist_id") int artist_id) {
		List<Album> list;
		list = albumService.getAlbumsByArtistId(artist_id);
		model.addAttribute("albums", list);
		return "artist";
		
	}
}
