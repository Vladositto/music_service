package org.vladositto.music_service.Services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.vladositto.music_service.Domain.Playlist;
import org.vladositto.music_service.Domain.Song;
import org.vladositto.music_service.Repository.PlaylistRepository;
import org.vladositto.music_service.Repository.SongRepository;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class PlaylistService {
	@Autowired
	private PlaylistRepository playlistRepository;


	public List<Playlist> getAllSong() {
		return playlistRepository.findAll();
	}

	public Playlist getById(final int id) {
		return playlistRepository.findById(id);
	}

	
	public int getCountAllItems() {
		return playlistRepository.countAllItems();
	}

	public void create(final Playlist src) {
		playlistRepository.createPlaylist(src);
	}
	
	public void update(final Playlist src) {
		playlistRepository.updatePlaylist(src);
	}
}
