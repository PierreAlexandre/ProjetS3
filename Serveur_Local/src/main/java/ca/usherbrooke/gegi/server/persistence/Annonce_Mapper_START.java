package ca.usherbrooke.gegi.server.persistence;

import ca.usherbrooke.gegi.server.business.Annonce;
import ca.usherbrooke.gegi.server.business.Student;
import org.apache.ibatis.annotations.Param;
import org.mybatis.cdi.Mapper;

import java.util.List;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@Mapper
public interface Annonce_Mapper_START {

    List<Annonce> select(@Param("id") Integer id);

}
