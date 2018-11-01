package ca.usherbrooke.gegi.server.presentation;

import ca.usherbrooke.gegi.server.business.Annonce;
import ca.usherbrooke.gegi.server.business.Annonce_book;
import ca.usherbrooke.gegi.server.persistence.Annonce_Book_Mapper;
import ca.usherbrooke.gegi.server.persistence.Annonce_Mapper;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
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
    public void anonce_Add(){
        System.out.println("annonce add ok test 1 int +++++++++++++++++");


        Annonce_book annonceBook = new Annonce_book();

        //annonceBook.setAd_id(10);
        annonceBook.set_categorie("itm01");
        annonceBook.setCip("cip02222");
        annonceBook.setType_ad_id(1);
        annonceBook.set_titre_annonce("Annonce pour livre de prog mybatis +sql");
        annonceBook.set_description("un tree bon livre de prog mybatis +sql ");
        annonceBook.setPrice(25.5);
        annonceBook.setContact("cip02222@gmail.com");


        annonce_Book_Mapper.insertAnnonce_Book(annonceBook);
        System.out.println("annonce add ok test 2 out ++++++++++++++++++");





    }
}
