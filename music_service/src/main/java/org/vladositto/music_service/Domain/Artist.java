package org.vladositto.music_service.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "artists")
public class Artist {
	@Id
	private int id;
	private String name;
	private String country;
	private String bio;
	public Artist(int id, String name, String country, String bio) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.bio = bio;
	}
	public Artist() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
}
