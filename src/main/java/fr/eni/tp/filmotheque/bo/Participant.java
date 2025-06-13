package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.Objects;

public class Participant extends Personne{
    private ArrayList<Film> film = new ArrayList<>();

    public Participant(long id, String nom, String prenom, ArrayList<Film> film) {
        super(id, nom, prenom);
        this.film = film;
    }

    public Participant(String nom, String prenom, ArrayList<Film> film) {
        super(nom, prenom);
        this.film = film;
    }

    public ArrayList<Film> getFilm() {
        return film;
    }

    public void setFilm(ArrayList<Film> film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "film=" + film +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Participant that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
