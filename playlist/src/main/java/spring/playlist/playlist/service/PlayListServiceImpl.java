package spring.playlist.playlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import spring.playlist.playlist.dao.PlaylistDAO;
import spring.playlist.playlist.domain.Playlist;

@Service
@Transactional
public class PlayListServiceImpl implements PlayListService {

    @Autowired
    private PlaylistDAO playlistDao;

    @Override
    public void salvar(Playlist playlist) {
        playlistDao.salvar(playlist);
    }

    @Override
    @Transactional()
    public List<Playlist> recuperar() {
        return playlistDao.recuperar();
    }

    @Override
    @Transactional()
    public Playlist recuperarPorId(long id) {
        return playlistDao.recuperarPorID(id);
    }

    @Override
    public void atualizar(Playlist playlist) {
        playlistDao.atualizar(playlist);
    }

    @Override
    public void excluir(long id) {
        playlistDao.excluir(id);
    }


   
}
