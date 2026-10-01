/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1.magasin;

/**
 *
 * @author imtia
 */
public class Produits {
    // Attributs
    int id;
    String nom;
    float prix;
    int quantite;
    // Méthodes
    public Produits(int id, String nom, float prix, int quantite) {
    this.id = id;
    this.nom = nom;
    this.prix = prix;
    this.quantite = quantite;  
    }
    // Getters
    public int getId() {
    return id;
    }
    public String getNom() {
    return nom;
    }
    public float getPrix() {
    return prix;
    }
    public int getQuantite() {
    return quantite;
    }
    
    //Setters
    public void setId(int id) {
    this.id = id;
    }
    public void setNom(String nom) {
    this.nom = nom;
    }
    public void setPrix(float prix) {
    this.prix = prix;
    }
    public void setQuantite(int quantite) {
    this.quantite = quantite;
    }
    
    // Creation de afficherDetails()
    public void afficherDetails() {
        System.out.println("id :"+id);
        System.out.println("nom :"+nom);
        System.out.println("prix"+prix);
        System.out.println("quantite :"+quantite);
    }
}
