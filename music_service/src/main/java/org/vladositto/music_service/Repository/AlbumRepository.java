package org.vladositto.music_service.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.vladositto.music_service.Domain.Album;
import org.vladositto.music_service.Domain.Song;

@Repository
public class AlbumRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Album> findAll() {
		Query query = entityManager.createQuery("SELECT e FROM Album e");
		return (List<Album>) query.getResultList();
	}

	public Album findById(int id) {
		return entityManager.find(Album.class, id);
	}

	public List<Album> findByArtistId(int artist_id) {
		Query query = entityManager.createQuery("SELECT s FROM Album s where s.artist.id =:artist_id");
		query.setParameter("artist_id", artist_id);
		try {
		return (List<Album>) query.getResultList();}
		catch(NoResultException e) {
			return null;
		}
	}
	public void createAlbum(Album item) {
		entityManager.persist(item);
		entityManager.flush();
	}

	public int countAllItems() {
		String SQL = "select count(*) from Album";
		return ((Long)entityManager.createQuery(SQL).getSingleResult()).intValue();
	}

}
