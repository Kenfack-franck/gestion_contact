/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import com.sun.jdi.connect.spi.Connection;
import java.util.Date;

/**
 *
 * @author kenfack
 */
public class Etudiant {
    private String cycle;
    private int niveau;

    // Constructeur
    public Etudiant(String code, String nom, Date dateDeNaissance, String address, String email, String telNumber, String cycle, int niveau) {
        super(code, nom, dateDeNaissance, address, email, telNumber);
        this.cycle = cycle;
        this.niveau = niveau;
    }

    
    public void insererDansBaseDeDonnees(Connection connection) throws SQLException {
        // Écrire ici la logique d'insertion pour un étudiant dans la base de données
        String query = "INSERT INTO etudiants (code, nom, date_de_naissance, address, email, tel_number, cycle, niveau) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, getCode());
            statement.setString(2, getnom());
            statement.setDate(3, new java.sql.Date(getDateDeNaissance().getTime()));
            statement.setString(4, getaddress());
            statement.setString(5, getemail());
            statement.setString(6, gettelNumber());
            statement.setString(7, cycle);
            statement.setInt(8, niveau);
            statement.executeUpdate();
        }
    }
}
