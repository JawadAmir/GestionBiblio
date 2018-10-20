package com.TP;
public class Livre {
    String titre;
    String auteur;
    Double prix;
    String editeur;
    String collection;
    public Livre(){
        super();
    }

    public Livre(String titre, String auteur, Double prix, String editeur, String collection) {
        super();
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.editeur = editeur;
        this.collection = collection;
    }
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public Double getPrix() {
        return prix;
    }
    public String getEditeur() {
        return editeur;
    }
    public String getCollection() {
        return collection;
    }
    @Override
    public String toString() {
        return "Livre { " +
                " titre: " + titre + " | "  +
                "  auteur: " + auteur + " | " +
                "  prix: " + prix + " da | "+
                "  editeur: " + editeur + " | " +
                "  collection: " + collection + " | " +
                '}';
    }
}