package com.TP;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Inventaire {
    private ArrayList<Livre> Livres = new ArrayList<>();
    Inventaire(){super();}
    boolean ajouterLivre(Livre livre) {
            Livres.add(livre);
            return true;
    }
    void afficherLivres() {
        for (int i = 0; i < Livres.size(); i++) {
            System.out.println(Livres.get(i));
        }
    }
    void AjouterFile(String pathname) throws FileNotFoundException {
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

    void rechercheAuteur(String auteur) {
        int i;
        boolean t = false;
        String[] parts;
        for (i = 0; i < Livres.size(); i++) {
            parts=Livres.get(i).getAuteur().split(" ");
            for(int j=0;j<parts.length;j++){
                if (auteur.equalsIgnoreCase(parts[j])) {
                    t = true;
                    System.out.println("------------------------\n" +
                            "Livre trouvé\n" + Livres.get(i)
                            + "\n------------------------");
                }
            }
        }
        if (!t) {
            System.out.println("Livre introuvable");
        }
    }

    void rechercheTitre(String titre) {
        int i;
        boolean t = false;
        String[] parts;
        for (i = 0; i < Livres.size(); i++) {
            parts=Livres.get(i).getTitre().split(" ");
            for(int j=0;j<parts.length;j++){
            if (titre.equalsIgnoreCase(parts[j])) {
                t = true;
                System.out.println("------------------------\n" +
                        "Livre trouvé\n" + Livres.get(i)
                        + "\n------------------------");
            }
            }
        }
        if (!t) {
            System.out.println("Livre introuvable");
        }

    }

    void rechercheCollection(String collection) {
        int i;
        boolean t = false;
        for (i = 0; i < Livres.size(); i++) {
            if (collection.equalsIgnoreCase(Livres.get(i).getCollection())) {
                t = true;
                System.out.println("------------------------\n" +
                        "Livre trouvé\n"+ Livres.get(i)
                        + "\n------------------------");
            }
        }
        if (!t) {
            System.out.println("Livre introuvable");
        }
    }
}