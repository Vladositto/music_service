package org.vladositto.music_service.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.vladositto.music_service.Domain.Playlist;
@Repository
public class PlaylistRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Playlist> findAll() {
		Query query = entityManager.createQuery("SELECT e FROM Playlist e");
		return (List<Playlist>) query.getResultList();
	}

	public Playlist findById(int id) {
		return entityManager.find(Playlist.class, id);
	}
	
	public void createPlaylist(Playlist item) {
		entityManager.persist(item);
		entityManager.flush();
	}
	public void updatePlaylist(final Playlist playlist) {
		entityManager.merge(playlist);

	}

	public int countAllItems() {
		String SQL = "select count(*) from Playlist";
		return ((Long)entityManager.createQuery(SQL).getSingleResult()).intValue();
	}

}
