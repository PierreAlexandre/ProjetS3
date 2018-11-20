package ca.usherbrooke.gegi.server.business;

import java.util.Date;

public class Annonce_book  extends  Annonce {
    private int ad_id;
    private  String cip;
    private String auteur;
    private String ISBN;
    private String edition;
    private String titre;
    //private Double price;
    private int type_ad_id;
    private String contact;

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public int getType_ad_id() {
        return type_ad_id;
    }

    public void setType_ad_id(int type_ad_id) {
        this.type_ad_id = type_ad_id;
    }



    /*public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }*/

    public String getAuteur() {
        return auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getEdition() {
        return edition;
    }

    public String getTitre() {
        return titre;
    }



    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }



    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getCip() {
        return cip;
    }

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    @Override
    public String toString() {
        return "Annonce_book{" +
                "ad_id=" + ad_id +
                ", cip='" + cip + '\'' +
                ", auteur='" + auteur + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", edition='" + edition + '\'' +
                ", titre='" + titre + '\'' +
                '}';
    }
}