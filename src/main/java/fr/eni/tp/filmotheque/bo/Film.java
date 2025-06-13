package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;

public class Film {

    private long id;
    private String titre;
    private int annee;
    private int duree;
    private String synopsis;
    private ArrayList<Avis> avis = new ArrayList<>();
    private Genre genre;
    private ArrayList<Participant> acteurs = new ArrayList<>();
    private Participant participant;

}
