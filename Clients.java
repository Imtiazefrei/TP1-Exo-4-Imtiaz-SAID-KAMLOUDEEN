/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1.magasin;

/**
 *
 * @author imtia
 */
public class Clients {
    //Attributs
    private int id;
    private String nom;
    private String email;

    // Méthodes
    public Clients(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getEmail() {
        return email;
    }

    // Setters
    public void setId(int id) {
    this.id = id;
    }
    public void setNom(String nom) {
    this.nom = nom;
    }
    public void setEmail(String email) {
    this.email = email;
    }

    // Creation de afficherDetails()
    public void afficherDetails() {
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Email : " + email);
    }
}
