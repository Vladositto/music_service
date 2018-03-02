package org.vladositto.music_service;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="App.Users")
public class Song {

	private int id;
	private int id_artist;
	private String genre;
	private String album;
	private int year;
	private String lang;
	
	
}
