package ca.usherbrooke.gegi.server.rest;

import ca.usherbrooke.gegi.server.dao.EtudiantMapper;
import ca.usherbrooke.gegi.server.dto.Etudiant;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("etudiant")
public class EtudiantService {

    @Inject
    EtudiantMapper etudiantMapper;

    @GET
    @Produces("application/json")
    public List<Etudiant> sayHello(@QueryParam("id") Integer id) {

        List<Etudiant> etudiants = etudiantMapper.select(id);
        return etudiants;
    }
}
