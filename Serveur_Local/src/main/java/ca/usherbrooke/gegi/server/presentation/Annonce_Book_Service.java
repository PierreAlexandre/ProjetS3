package ca.usherbrooke.gegi.server.presentation;

import ca.usherbrooke.gegi.server.business.Annonce;
import ca.usherbrooke.gegi.server.business.Annonce_book;
import ca.usherbrooke.gegi.server.persistence.Annonce_Book_Mapper;
import ca.usherbrooke.gegi.server.persistence.Annonce_Mapper;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import java.util.List;


@Path("annonce")
public class Annonce_Book_Service {

    @Context
    HttpServletRequest httpServletRequest;

    @Inject

    Annonce_Book_Mapper annonce_Book_Mapper;

    @Path("/add_annonce")
    public void anonce_Add(@QueryParam("cip") String cip, @QueryParam("type_ad_id") Integer type_ad_id, @QueryParam("titre_annonce") String titre_annonce,
                           @QueryParam("description") String description, @QueryParam("prix") double prix, @QueryParam("contact") String contact,
                           @QueryParam("auteur") String auteur, @QueryParam("ISBN") String ISBN, @QueryParam("edition") String edition,
                           @QueryParam("titre") String titre, @QueryParam("course_id") String course_id){
        System.out.println("annonce add ok test 1 int +++++++++++++++++");


        Annonce_book annonceBook = new Annonce_book();

        //annonceBook.setAd_id(10);
        //annonceBook.set_categorie("itm01");
        annonceBook.setCip(cip);
        annonceBook.setType_ad_id(type_ad_id);
        annonceBook.set_titre_annonce(titre_annonce);
        annonceBook.set_description(description);
        annonceBook.set_prix(prix);
        annonceBook.setContact(contact);
        annonceBook.setAuteur(auteur);
        annonceBook.setISBN(ISBN);
        annonceBook.setEdition(edition);
        annonceBook.setTitre(titre);
        annonceBook.set_cours_id(course_id);

        annonce_Book_Mapper.insertAnnonce_Book(annonceBook);
        System.out.println("annonce add ok test 2 out ++++++++++++++++++");


    }

    @Path("/delete_annonce")
    public void anonce_delete(@QueryParam("annonce_id") Integer annonce_id ){
        System.out.println("annonce delete test ok int +++++++++++++++++");


        Annonce_book annonceBook = new Annonce_book();


        annonceBook.setCip(httpServletRequest.getUserPrincipal().getName());
        annonceBook.setAd_id(annonce_id);
        //annonceBook.setCip("ihab0001");
        //annonceBook.set_annonce_id(25);

        annonce_Book_Mapper.deleteAnnonce_Book(annonceBook);
        System.out.println("annonce delete test ok out ++++++++++++++++++");


    }
}
