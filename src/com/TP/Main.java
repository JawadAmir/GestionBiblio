package com.TP;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public Main() {
        super();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Inventaire inventaire = new Inventaire();
        Scanner sc = new Scanner(System.in);
        Livre livre;
        boolean t = true;
        /*On mets l'adresse du fichier .txt
        a l'ordre Titre,Auteur,Prix,Editeur,Collection
         */
        inventaire.AjouterFile("C:\\Users\\Amir\\Desktop\\L2\\Modules S1\\POO\\Projet JAVA\\GestionFnac\\Livres.txt");
        System.out.println("Systeme de gestion de Bibliothèque");
        while(t) {
            System.out.println("Pour faire une recherche d'un livre (1)\n" +
                    "Pour voir tout l'inventaire (2)\n"+
                    "Pour ajouter un livre (3)\n"
                    +"Pour quitter le programme (4)");
            switch (sc.nextInt()) {
                case 1: //faire une recherche
                    sc = new Scanner(System.in);
                    boolean j=false;
                    while (!j) {
                        System.out.println("Voulez vous chercher un livre par \n" +
                                "-Auteur (1)\n-Titre (2)\n-Collection (3)\n-Quitter la recherche (4)");
                        switch (sc.nextInt()) {
                            case 1://Chercher par Auteur
                                sc = new Scanner(System.in);
                                System.out.println("Donner le nom de l'auteur");
                                inventaire.rechercheAuteur(sc.nextLine());
                                break;
                            case 2://chercher par Titre
                                sc = new Scanner(System.in);
                                System.out.println("Donner le titre de livre");
                                inventaire.rechercheTitre(sc.nextLine());
                                break;
                            case 3://chercher par Collection
                                sc = new Scanner(System.in);
                                System.out.println("Donner le nom de la collection");
                                inventaire.rechercheCollection(sc.nextLine());
                                break;
                            case 4: //Quitter programme
                                j = true;
                            default:
                                break;
                        }
                    }
                    break;
                case 2: //Afficher l'inventaire
                    inventaire.afficherLivres();
                    break;
                case 3: //Ajouter un livre
                    livre= new Livre();
                    sc=new Scanner(System.in);
                    System.out.println("Donner le titre du livre");
                    livre.setTitre(sc.nextLine());
                    System.out.println("Donner l'auteur du livre");
                    livre.setAuteur(sc.nextLine());
                    System.out.println("Donner l'editeur du livre");
                    livre.setEditeur(sc.nextLine());
                    System.out.println("Donner la collection");
                    livre.setCollection(sc.nextLine());
                    System.out.println("Donner le prix du livre");
                    livre.setPrix(sc.nextDouble());
                    if(inventaire.ajouterLivre(livre)) System.out.println("Livre ajouté avec succés");
                    break;
                case 4: //Quitter programme
                    t = false;
                    break;
                default:
                    break;
            }
        }
    }
}
