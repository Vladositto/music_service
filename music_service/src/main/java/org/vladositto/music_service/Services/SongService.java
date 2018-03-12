package org.vladositto.music_service.Services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.vladositto.music_service.Domain.Song;
import org.vladositto.music_service.Repository.SongRepository;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SongService {
	@Autowired
	private SongRepository songRepository;


	public List<Song> getAllSong() {
		return songRepository.findAll();
	}

	public Song getById(final int id) {
		return songRepository.findById(id);
	}

	
	public int getCountAllItems() {
		return songRepository.countAllItems();
	}

	public void create(final Song src) {
		songRepository.createSong(src);
	}
}
