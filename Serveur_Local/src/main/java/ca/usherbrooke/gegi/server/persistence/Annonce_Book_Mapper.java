package ca.usherbrooke.gegi.server.persistence;

import ca.usherbrooke.gegi.server.business.Annonce_book;
import org.mybatis.cdi.Mapper;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@Mapper
public interface Annonce_Book_Mapper {


    void insertAnnonce_Book(Annonce_book annonce_Book);
}
