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
public class Magasin {
    private ArrayList<Produits> produits;

    // Constructeur
    public Magasin() {
        produits = new ArrayList<>();
    }

    // Ajouter un produit
    public void ajouterProduit(Produits produit) {
        produits.add(produit);
    }

    // Afficher les produits disponibles
    public void afficherProduitsDisponibles() {
        for (Produits produit : produits) {
            if (produit.getQuantite() > 0) {
                produit.afficherDetails();
            }
        }
    }

    // Trouver un produit par son nom
    public Produits trouverProduitParNom(String nom) {
        for (Produits produit : produits) {
            if (produit.getNom().equalsIgnoreCase(nom)) {
                return produit;
            }
        }
        return null;
    }
}
