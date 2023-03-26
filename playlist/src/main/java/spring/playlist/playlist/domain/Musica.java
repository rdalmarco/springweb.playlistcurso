package spring.playlist.playlist.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "musicas")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String titulo;

    @Column(nullable = false, length = 50)  
    private String banda;

    @Column(nullable = false)
    public int nota;

    @ManyToOne
    @JoinColumn(name = "id_playlist_fk")
    public Playlist playlist;

    public Musica() {
    }

    public Musica(long id, String titulo, String banda, int nota, Playlist playlist) {
        this.id = id;
        this.titulo = titulo;
        this.banda = banda;
        this.nota = nota;
        this.playlist = playlist;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBanda() {
        return this.banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Playlist getPlaylist() {
        return this.playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

}
