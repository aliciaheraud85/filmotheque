package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.Objects;

public class Film {

    private long id;
    private String titre;
    private int annee;
    private int duree;
    private String synopsis;
    private ArrayList<Avis> avis = new ArrayList<>();
    private Genre genre;
    private ArrayList<Participant> acteurs = new ArrayList<>();
    private Participant realisateur;

    public Film(long id, String titre, int annee, int duree, String synopsis) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.avis = avis;
        this.acteurs = acteurs;
        this.genre = genre;
        this.realisateur = realisateur;
    }

    public Film(String titre, int annee, int duree, String synopsis, ArrayList<Avis> avis, ArrayList<Participant> acteurs, Genre genre, Participant realisateur) {
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.avis = avis;
        this.acteurs = acteurs;
        this.genre = genre;
        this.realisateur = realisateur;
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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public ArrayList<Avis> getAvis() {
        return avis;
    }

    public void setAvis(ArrayList<Avis> avis) {
        this.avis = avis;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public ArrayList<Participant> getActeurs() {
        return acteurs;
    }

    public void setActeurs(ArrayList<Participant> acteurs) {
        this.acteurs = acteurs;
    }

    public Participant getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Participant realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Film (");
        builder.append(id);
        builder.append(")\n\ttitre : ");
        builder.append(titre);
        builder.append("[annee : ");
        builder.append(annee);
        builder.append(", duree : ");
        builder.append(duree);
        builder.append(" minutes]\n\tSynopsis : ");
        builder.append(synopsis);
        builder.append("\n\trealisateur : ");
        builder.append(realisateur);
        builder.append("\n\tacteurs : ");
        builder.append(acteurs);
        builder.append("\n\tgenre : ");
        builder.append(genre);
        builder.append("\n\tAvis : ");
        builder.append(avis);
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Film film)) return false;
        return id == film.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
