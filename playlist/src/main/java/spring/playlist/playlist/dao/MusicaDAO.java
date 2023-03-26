package spring.playlist.playlist.dao;

import java.util.List;

import spring.playlist.playlist.domain.Musica;

public interface MusicaDAO {
    
    void salvar(Musica musica);
    List<Musica> recuperarPorPlayList(long playlistID);
    Musica recuperarPorPlayListIDEMusicaID(long playlistID, long musicaID);
    void atualizar(Musica musica);
    void excluir(long musicaId);
}
