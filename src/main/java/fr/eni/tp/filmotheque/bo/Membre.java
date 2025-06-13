package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.Objects;

public class Membre extends Personne{
    private String pseudo;
    private String motDePasse;
    private boolean admin;
    private ArrayList<Avis> avis = new ArrayList<>();

    public Membre(long id, String nom, String prenom, String pseudo, String motDePasse, boolean admin, ArrayList<Avis> avis) {
        super(id, nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = false;
        this.avis = avis;
    }

    public Membre(String nom, String prenom, String pseudo, String motDePasse, boolean admin, ArrayList<Avis> avis) {
        super(nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = false;
        this.avis = avis;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public ArrayList<Avis> getAvis() {
        return avis;
    }

    public void setAvis(ArrayList<Avis> avis) {
        this.avis = avis;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "pseudo='" + pseudo + '\'' +
                ", admin=" + admin +
                ", avis=" + avis +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Membre membre)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(id, membre.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
