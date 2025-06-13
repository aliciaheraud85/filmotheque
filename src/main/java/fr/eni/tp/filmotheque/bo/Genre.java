package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.Objects;

public class Genre {

    private long id;
    private String titre;
    private ArrayList<Film> film = new ArrayList<>();

    public Genre(long id, String titre, ArrayList<Film> film) {
        this.id = id;
        this.titre = titre;
        this.film = film;
    }

    public Genre(String titre, ArrayList<Film> film) {
        this.titre = titre;
        this.film = film;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ArrayList<Film> getFilm() {
        return film;
    }

    public void setFilm(ArrayList<Film> film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", film=" + film +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Genre genre)) return false;
        return id == genre.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
