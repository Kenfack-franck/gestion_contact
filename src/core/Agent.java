/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.sql.Connection;
import java.sql.PreparedStatement; // Add this import
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author kenfack
 */
public class Agent extends Contact {
    
    
    private int salaire;
    private String statut;
    private String categorie;
    private int indiceDeSalaire;
    private String occupation;

    // Constructeur
    public Agent(String code, String nom, Date dateDeNaissance, String address, String email, String telNumber, int salaire, String statut, String categorie, int indiceDeSalaire, String occupation) {
        super(code,nom,dateDeNaissance,address,email,telNumber);
        this.salaire = salaire;
        this.statut = statut;
        this.categorie = categorie;
        this.indiceDeSalaire = indiceDeSalaire;
        this.occupation = occupation;
    }

   

    public void setSalaire(int salaire){
        this.salaire=salaire;
    }

    public void setStatut(String statut){
        this.statut=statut;
    }

    public void setCategorie(String categorie){
        this.categorie=categorie;
    }

    public void setIndiceDeSalaire(int indiceDeSalaire){
        this.indiceDeSalaire=indiceDeSalaire;
    }

    public void setOccupation(String occupation){
        this.occupation=occupation;
    }

    public int getSalaire(){
        return salaire;
    }

    public String getStatut(){
        return this.statut;
    }

    public String getCategorie(){
        return this.categorie;
    }

    public int getIndiceDeSalaire(){
        return this.indiceDeSalaire;
    }

    public String getOccupation(){
        return this.occupation;
    }



    public void insererDansBaseDeDonnees(Connection connection) throws SQLException {
        // Écrire ici la logique d'insertion pour un agent dans la base de données
        String query = "INSERT INTO agents (code, nom, date_de_naissance, address, email, tel_number, salaire, statut, categorie, indice_de_salaire, occupation) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, getCode());
            statement.setString(2, getnom());
            statement.setDate(3, new java.sql.Date(getDateDeNaissance().getTime()));
            statement.setString(4, getaddress());
            statement.setString(5, getemail());
            statement.setString(6, gettelNumber());
            statement.setInt(7, salaire);
            statement.setString(8, statut);
            statement.setString(9, categorie);
            statement.setInt(10, indiceDeSalaire);
            statement.setString(11, occupation);
            statement.executeUpdate();
        }
    }
}
