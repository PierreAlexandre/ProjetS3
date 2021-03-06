package ca.usherbrooke.gegi.server.presentation;

import ca.usherbrooke.gegi.server.business.Annonce_book;
import ca.usherbrooke.gegi.server.persistence.Annonce_Mapper;
import ca.usherbrooke.gegi.server.business.Annonce;
import ca.usherbrooke.gegi.server.persistence.Annonce_Book_Mapper;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import java.util.List;

@Path("annonce")
public class Annonce_Service {

    @Context
    HttpServletRequest httpServletRequest;

    @Inject
    Annonce_Mapper annonce_Mapper;



    @GET
    @Produces("application/json")
    public List<Annonce> get_Annonce(@QueryParam("id") Integer id) {

        System.out.println(httpServletRequest.getUserPrincipal().getName());
        List<Annonce> annonces = annonce_Mapper.select(id);
        return annonces;
    }




}
