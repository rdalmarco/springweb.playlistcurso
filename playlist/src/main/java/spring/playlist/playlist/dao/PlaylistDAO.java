package spring.playlist.playlist.dao;

import java.util.List;

import spring.playlist.playlist.domain.Playlist;

public interface PlaylistDAO {

    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorID(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);
    
}
