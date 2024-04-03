/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author kenfack
 */
public abstract class Contact {
    String code;
    String nom;
    Date DateDeNaissance;
    String address;
    String email;
    String telNumber;

    public Contact(String code,String nom,Date DateDeNaissance, String address,String email,String telNumber){

        this.code=code;
        this.nom=nom;
        this.DateDeNaissance=DateDeNaissance;
        this.address=address;
        this.email=email;
        this.telNumber=telNumber;


    }

    public void setCode(String code){
        this.code=code;
    }

    public void setnom(String nom){
        this.nom=nom;
    }

    public void setDateDeNaissance(Date DateDeNaissance){
        this.DateDeNaissance = DateDeNaissance;
    }

    public void setaddress(String address){
        this.address=address;
    }

    public void setemail(String email){
        this.email=email;
    }

    public void settelNumber(String telNumber){
        this.telNumber=telNumber;
    }

    public String getCode(){
        return this.code;
    }

    public String getnom(){
        return this.nom;
    }


    public Date getDateDeNaissance(){
        return this.DateDeNaissance;
    }

    public String getaddress(){
        return this.address;
    }

    public String getemail(){
        return this.email;
    }

    public String gettelNumber(){
        return this.telNumber;
    }


    public abstract void insererDansBaseDeDonnees(Connection connection) throws SQLException;


}
