package org.vladositto.music_service.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.vladositto.music_service.Domain.Artist;

@Repository
public class ArtistRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Artist> findAll() {
		Query query = entityManager.createQuery("SELECT e FROM Artists e");
		return (List<Artist>) query.getResultList();
	}

	public Artist findById(int id) {
		return entityManager.find(Artist.class, id);
	}

	public void createArtist(Artist item) {
		entityManager.persist(item);
		entityManager.flush();
	}

	public int countAllItems() {
		String SQL = "select count(*) from Artist";
		return ((Long)entityManager.createQuery(SQL).getSingleResult()).intValue();
	}

}
