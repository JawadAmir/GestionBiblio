package com.TP;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Inventaire extends Livre {
    ArrayList<Livre> Livres = new ArrayList<>();

    public Inventaire() {
        super();
    }
    public boolean ajouterLivre(Livre livre) {
            Livres.add(livre);
            return true;
    }
    public void afficherLivres() {
        for (int i = 0; i < Livres.size(); i++) {
            System.out.println(Livres.get(i));
        }
    }
    public void AjouterFile(String pathname) throws FileNotFoundException {
        Scanner s = new Scanner(new java.io.File(pathname));
        ArrayList<String[]> part = new ArrayList<>();
        Livre livre;
        while (s.hasNextLine()) {
            part.add((s.nextLine().split(",")));
        }
        for (int i = 0; i < part.size(); i++) {
            livre = new Livre(part.get(i)[0], part.get(i)[1],
                    Double.parseDouble(part.get(i)[2]), part.get(i)[3], part.get(i)[4]);
            ajouterLivre(livre);
        }
    }

    public void rechercheAuteur(String auteur) {
        int i;
        boolean t = false;
        for (i = 0; i < Livres.size(); i++) {
            if (auteur.equals(Livres.get(i).getAuteur())) {
                t = true;
                System.out.println("------------------------\n" +
                        "Livre trouvé\nTitre: " + Livres.get(i).getTitre() +
                        "\nAuteur: " + Livres.get(i).getAuteur() + "\nPrix: " + Livres.get(i).getPrix() +
                        "\nEditeur: " + Livres.get(i).getEditeur()
                        + "\nCollection: " + Livres.get(i).getCollection()
                        + "\n------------------------");
            }
        }
        if (!t) {
            System.out.println("Livre introuvable");
        }
    }

    public void rechercheTitre(String titre) {
        int i;
        boolean t = false;
        for (i = 0; i < Livres.size(); i++) {
            if (titre.equals(Livres.get(i).getTitre())) {
                t = true;
                System.out.println("------------------------\n" +
                        "Livre trouvé\nTitre: " + Livres.get(i).getTitre() +
                        "\nAuteur: " + Livres.get(i).getAuteur() + "\nPrix: " + Livres.get(i).getPrix() +
                        "\nEditeur: " + Livres.get(i).getEditeur()
                        + "\nCollection: " + Livres.get(i).getCollection()
                        + "\n------------------------");
            }
        }
        if (!t) {
            System.out.println("Livre introuvable");
        }

    }

    public void rechercheCollection(String collection) {
        int i;
        boolean t = false;
        for (i = 0; i < Livres.size(); i++) {
            if (collection.equals(Livres.get(i).getCollection())) {
                t = true;
                System.out.println("------------------------\n" +
                        "Livre trouvé\nTitre: " + Livres.get(i).getTitre() +
                        "\nAuteur: " + Livres.get(i).getAuteur() + "\nPrix: " + Livres.get(i).getPrix() +
                        "\nEditeur: " + Livres.get(i).getEditeur()
                        + "\nCollection: " + Livres.get(i).getCollection()
                        + "\n------------------------");
            }
        }
        if (!t) {
            System.out.println("Livre introuvable");
        }
    }
}