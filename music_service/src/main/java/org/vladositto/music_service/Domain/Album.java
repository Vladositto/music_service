package org.vladositto.music_service.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="albums")
public class Album {
	@Id
	private int id;
	private int year;
	private String genre;
	private String title;
	public Album(int id, int year, String genre, String title) {
		super();
		this.id = id;
		this.year = year;
		this.genre = genre;
		this.title = title;
	}
	public Album() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
