package org.vladositto.music_service.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vladositto.music_service.Domain.Song;

@Repository
public class SongRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Song> findAll() {
		Query query = entityManager.createQuery("SELECT e FROM Song e");
		return (List<Song>) query.getResultList();
	}

	public Song findById(int id) {
		return entityManager.find(Song.class, id);
	}

	public void createSong(Song item) {
		entityManager.persist(item);
		entityManager.flush();
	}

	public int countAllItems() {
		String SQL = "select count(*) from Song";
		return ((Long)entityManager.createQuery(SQL).getSingleResult()).intValue();
	}

}
