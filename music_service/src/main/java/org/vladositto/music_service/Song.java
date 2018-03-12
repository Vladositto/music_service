package org.vladositto.music_service;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="songs")
public class Song {

	private int id;
	private int id_artist;
	private String genre;
	private String album;
	private int year;   
	private String lang;
		
	public Song(int id, int id_artist, String genre, String album, int year, String lang) {
		super();
		this.id = id;
		this.id_artist = id_artist;
		this.genre = genre;
		this.album = album;
		this.year = year;
		this.lang = lang;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_artist() {
		return id_artist;
	}
	public void setId_artist(int id_artist) {
		this.id_artist = id_artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
	
}
