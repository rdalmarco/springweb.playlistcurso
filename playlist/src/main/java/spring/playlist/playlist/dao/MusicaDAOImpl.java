package spring.playlist.playlist.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import spring.playlist.playlist.domain.Musica;

@Repository
public class MusicaDAOImpl implements MusicaDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Musica musica) {
        em.persist(musica);
    }

    @Override
      public List<Musica> recuperarPorPlayList(long playlistID) {
      return em.createQuery("select m from Musica m where m.playlist.id = :playlistId", Musica.class).setParameter("playlistId", playlistID).getResultList();
      }

    @Override
      public Musica recuperarPorPlayListIDEMusicaID(long playlistID, long musicaID) {
      return em.createQuery("select m from Musica m where m.playlist.id = :playlistId andm.id = :musicaId", Musica.class).setParameter("playlistId", playlistID)
                  .setParameter("musicaId", musicaID)
                  .getSingleResult();
      }

    @Override
    public void atualizar(Musica musica) {
        em.merge(musica);
    }

    @Override
    public void excluir(long musicaId) {
        em.remove(em.getReference(Musica.class, musicaId));
    }

}