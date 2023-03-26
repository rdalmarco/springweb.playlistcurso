package spring.playlist.playlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import spring.playlist.playlist.dao.MusicaDAO;
import spring.playlist.playlist.domain.Musica;

@Service
@Transactional
public class MusicaServiceImpl implements MusicaService {

      @Autowired
      private MusicaDAO musicaDao;

      @Autowired
      private PlayListService playlistService;

      @Override
      public void salvar(Musica musica, long playlistId) {
      musica.setPlaylist(playlistService.recuperarPorId(playlistId));
      musicaDao.salvar(musica);
      }

      @Override
      @Transactional()
      public List<Musica> recuperarPorPlaylist(long playlistId) {
      return musicaDao.recuperarPorPlayList(playlistId);
      }

      @Override
      @Transactional()
      public Musica recuperarPorPlaylistIdEMusicaId
       (long playlistId, long musicaId) {
      return musicaDao.recuperarPorPlayListIDEMusicaID
       (playlistId, musicaId);
      }

      @Override
      public void atualizar(Musica musica, long playlistId) {
      musica.setPlaylist(playlistService.recuperarPorId(playlistId));
      musicaDao.atualizar(musica);
      }

      @Override
      public void excluir(long playlistId, long musicaId) {
      musicaDao.excluir(recuperarPorPlaylistIdEMusicaId
        (playlistId, musicaId).getId());
      }
}
    

