package com.TP;
public class Livre {
    private String titre;
    private String auteur;
    private Double prix;
    private String editeur;
    private String collection;
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

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
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