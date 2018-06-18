package org.vladositto.music_service.Domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import javax.persistence.JoinColumn;
@Entity
@Table (name = "playlists")
public class Playlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( nullable = true)
	private int id = 0;
	@OneToOne(mappedBy = "playlist")
	private User user;
	 @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	 @JoinTable(name = "playlist_song",
     joinColumns = @JoinColumn(name = "playlist_id"),
     inverseJoinColumns = @JoinColumn(name = "song_id"))
	private Set<Song> songs = new HashSet<Song>();

	
	public Playlist(int id) {
		this.id = id;

	}
	public Playlist() {

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Song> getSongs() {
		return songs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSongs(Set<Song> songs) {
		this.songs = songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((songs == null) ? 0 : songs.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Playlist other = (Playlist) obj;
		if (id != other.id)
			return false;
		if (songs == null) {
			if (other.songs != null)
				return false;
		} else if (!songs.equals(other.songs))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", user=" + user + ", songs=" + songs + "]";
	}
	
	

}
