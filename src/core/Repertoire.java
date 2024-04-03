/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

/**
 *
 * @author kenfack
 */
public class Repertoire {
    List<Contact> listDeContact=new ArrayList<Contact>();

    public void ajouterUnContact(String code,String nom,Date DateDeNaissance, String address,String email,String telNumber){
        // Contact contact=new Contact(code,nom,DateDeNaissance,address,email,telNumber);
        // listDeContact.add(contact);

    }

    public void supprimerUnContact(String nom ){
        ListIterator iter= listDeContact.listIterator(); 
        while(iter.hasNext()){
            Contact contact=(Contact)iter.next();
            if(contact.getnom().equals(nom)){
                iter.remove();
            }
        }
    }

    public void modifierUnContact(){
        
    }

    public void RechercherUnContact(){
        ListIterator list=listDeContact.listIterator();

        
    }
}
