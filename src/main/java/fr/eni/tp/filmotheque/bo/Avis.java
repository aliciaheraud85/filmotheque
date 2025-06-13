package fr.eni.tp.filmotheque.bo;

import java.util.Objects;

public class Avis {
    private long id;
    private int note;
    private String commentaire;
    private Membre membre;
    private Film film;

    public Avis(int note, long id, String commentaire, Membre membre, Film film) {
        this.note = note;
        this.id = id;
        this.commentaire = commentaire;
        this.membre = membre;
        this.film = film;
    }

    public Avis(int note, String commentaire, Membre membre, Film film) {
        this.note = note;
        this.commentaire = commentaire;
        this.membre = membre;
        this.film = film;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return "Avis{" +
                "id=" + id +
                ", note=" + note +
                ", commentaire='" + commentaire + '\'' +
                ", membre=" + membre +
                ", film=" + film +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Avis avis)) return false;
        return id == avis.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
