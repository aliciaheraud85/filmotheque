package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;

public class Membre extends Personne{
    private String pseudo;
    private String motDePasse;
    private boolean admin;
    private ArrayList<Avis> avis = new ArrayList<>();
}
