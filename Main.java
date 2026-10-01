/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.magasin;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author imtia
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création du client
        Clients client = new Clients(1, "Imtiaz", "imtiaz@gmail.com");

        // Création du magasin
        Magasin magasin = new Magasin();

        // Création des produits
        Produits p1 = new Produits(1, "Ordinateur", 800, 5);
        Produits p2 = new Produits(2, "Souris", 20, 10);
        Produits p3 = new Produits(3, "Clavier", 50, 0);

        // Ajout des produits au magasin
        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        magasin.ajouterProduit(p3);

        // Création du panier
        Panier panier = new Panier();

        // Interaction avec le client
        int choix;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Afficher les produits");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer une commande");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {

                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Nom du produit : ");
                    String nom = scanner.nextLine();

                    Produits produit = magasin.trouverProduitParNom(nom);

                    if (produit != null && produit.getQuantite() > 0) {
                        panier.ajouterProduit(produit);
                        produit.setQuantite(produit.getQuantite() - 1);
                        System.out.println("Produit ajouté au panier !");
                    } else {
                        System.out.println("Produit introuvable ou indisponible.");
                    }
                    break;

                case 3:
                    panier.afficherPanier();
                    System.out.println("Total : " + panier.calculerTotal() + " €");
                    break;

                case 4:
                    if (panier.calculerTotal() > 0) {
                        ArrayList<Produits> produitsCommande = new ArrayList<>();
                        // On récupère les produits du panier
                        produitsCommande.addAll(panier.getProduits());

                        Commandes commande = new Commandes(
                            1, client, produitsCommande
                        );

                        commande.afficherDetailsCommande();
                    } else {
                        System.out.println("Votre panier est vide.");
                    }
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        scanner.close();
    }
        
        
    
}
