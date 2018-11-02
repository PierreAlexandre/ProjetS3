package ca.usherbrooke.gegi.server.business;

import java.util.Date;

public class Annonce{
    private Integer annonce_id;
    private Date date_annonce;
    private String categorie;
    private String titre_annonce;
    private String type_annonce;
    private String description;
    private Double prix;
    private String specification_name;
    private String nom_article;
    private String course_id;
    private String nom_annonceur;
    private String contact_annonceur;

    public Integer get_annonce_id() {
        return annonce_id;
    }

    public void set_annonce_id(Integer annonce_id) {
        this.annonce_id = annonce_id;
    }

    public Date get_date_annonce() {
        return date_annonce;
    }

    public void set_date_annonce(Date date_annonce) {
        this.date_annonce = date_annonce;
    }

    public String get_categorie() {
        return categorie;
    }

    public void set_categorie(String categorie) {
        this.categorie = categorie;
    }

    public String get_titre_annonce() {
        return titre_annonce;
    }

    public void set_titre_annonce(String titre_annonce) {
        this.titre_annonce = titre_annonce;
    }

    public String get_type_annonce() {
        return type_annonce;
    }

    public void set_type_annonce(String type_annonce) {
        this.type_annonce = type_annonce;
    }

    public String get_description() {
        return description;
    }

    public void set_description(String description) {
        this.description = description;
    }

    public Double get_prix() {
        return prix;
    }

    public void set_prix(Double prix) {
        this.prix = prix;
    }

    public String get_specification_name() {
        return specification_name;
    }

    public void set_specification_name(String specification_name) {
        this.specification_name = specification_name;
    }

    public String get_nom_article() {
        return nom_article;
    }

    public void set_nom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    public String get_cours_id() {
        return course_id;
    }

    public void set_cours_id(String course_id) {
        this.course_id = course_id;
    }

    public String get_nom_annonceur() {
        return nom_annonceur;
    }

    public void set_nom_annonceur(String nom_annonceur) {
        this.nom_annonceur = nom_annonceur;
    }

    public String get_contact_annonceurr() {
        return contact_annonceur;
    }

    public void set_contact_annonceur(String nom_annonceur) {
        this.contact_annonceur = contact_annonceur;
    }

    @Override
    public String toString() {
        return "Annonce{" +
                "annonce_id=" + annonce_id +
                ", Date='" + date_annonce + '\'' +
                ", categorie='" + categorie + '\'' +
                ", Titre='" + titre_annonce + '\'' +
                ", prix='" + prix + '\'' +
                ", nom article='" + nom_article + '\'' +
                ", nom vendeur='" + nom_annonceur + '\'' +
                '}';
    }
}