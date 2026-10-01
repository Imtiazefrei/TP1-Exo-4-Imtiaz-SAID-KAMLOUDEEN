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
public class Panier {
    private ArrayList<Produits> produits;

    // Constructeur
    public Panier() {
        produits = new ArrayList<>();
    }

    // Ajouter un produit
    public void ajouterProduit(Produits produit) {
        produits.add(produit);
    }

    // Supprimer un produit
    public void supprimerProduit(Produits produit) {
        produits.remove(produit);
    }

    // Afficher les produits
    public void afficherPanier() {
        for (Produits produit : produits) {
            produit.afficherDetails();
        }
    }
    
    public ArrayList<Produits> getProduits() {
    return produits;
    }

    // Calculer le total
    public double calculerTotal() {
        double total = 0;

        for (Produits produit : produits) {
            total = total + produit.getPrix();
        }

        return total;
    }
    
}
