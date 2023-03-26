package spring.playlist.playlist.service;

import java.util.List;

import spring.playlist.playlist.domain.Playlist;

public interface PlayListService {
    
        void salvar(Playlist playlist);
        List<Playlist> recuperar();
        Playlist recuperarPorId(long id);
        void atualizar(Playlist playlist);
        void excluir(long id);
     
     }
