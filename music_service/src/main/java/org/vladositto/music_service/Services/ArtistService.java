package org.vladositto.music_service.Services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.vladositto.music_service.Domain.Artist;
import org.vladositto.music_service.Repository.ArtistRepository;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ArtistService {
	@Autowired
	private ArtistRepository artistRepository;


	public List<Artist> getAllArtists() {
		return artistRepository.findAll();
	}

	public Artist getById(final int id) {
		return artistRepository.findById(id);
	}

	
	public int getCountAllItems() {
		return artistRepository.countAllItems();
	}

	public void create(final Artist src) {
		artistRepository.createArtist(src);
	}
}
