package org.vladositto.music_service.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.vladositto.music_service.Domain.Album;

@Repository
public class AlbumRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Album> findAll() {
		Query query = entityManager.createQuery("SELECT e FROM Albums e");
		return (List<Album>) query.getResultList();
	}

	public Album findById(int id) {
		return entityManager.find(Album.class, id);
	}

	public void createAlbum(Album item) {
		entityManager.persist(item);
		entityManager.flush();
	}

	public int countAllItems() {
		String SQL = "select count(*) from Albums";
		return ((Long)entityManager.createQuery(SQL).getSingleResult()).intValue();
	}

}
