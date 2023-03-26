package spring.playlist.playlist.service;

import java.util.List;

import spring.playlist.playlist.domain.Musica;

public interface MusicaService {

        void salvar(Musica musica, long playlistId);
        List<Musica> recuperarPorPlaylist(long playlistId);
        Musica recuperarPorPlaylistIdEMusicaId
         (long playlistId, long musicaId);
        void atualizar(Musica musica, long playlistId);
        void excluir(long playlistId, long musicaId);
     
}
