/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1.magasin;

import java.util.ArrayList;

/**
 *
 * @author imtia
 */
public class Commandes {
    private int idCommande;
    private Clients client;
    private ArrayList<Produits> produitsCommandes;
    private double total;

    // Constructeur
    public Commandes(int idCommande, Clients client, ArrayList<Produits> produitsCommandes) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(produitsCommandes);
        this.total = 0;

        for (Produits produit : produitsCommandes) {
            total = total + produit.getPrix();
        }
    }

    // Afficher les détails de la commande
    public void afficherDetailsCommande() {
        System.out.println("Numéro de commande : " + idCommande);

        System.out.println("Client : ");
        client.afficherDetails();

        System.out.println("Produits commandés : ");
        for (Produits produit : produitsCommandes) {
            produit.afficherDetails();
        }

        System.out.println("Total : " + total + " €");
    }
    
}
