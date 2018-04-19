package org.vladositto.music_service.Services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.vladositto.music_service.Domain.Album;
import org.vladositto.music_service.Repository.AlbumRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AlbumService {
	@Autowired
	private AlbumRepository albumRepository;


	public List<Album> getAllAlbums() {
		return albumRepository.findAll();
	}

	public Album getById(final int id) {
		return albumRepository.findById(id);
	}

	
	public int getCountAllItems() {
		return albumRepository.countAllItems();
	}

	public void create(final Album src) {
		albumRepository.createAlbum(src);
	}
}
