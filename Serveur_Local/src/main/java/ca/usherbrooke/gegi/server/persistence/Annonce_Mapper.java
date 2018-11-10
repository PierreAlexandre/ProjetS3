package ca.usherbrooke.gegi.server.persistence;

import ca.usherbrooke.gegi.server.business.Annonce;

import org.apache.ibatis.annotations.Param;
import org.mybatis.cdi.Mapper;


import java.util.List;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@Mapper
public interface Annonce_Mapper {

    List<Annonce> select(@Param("id") Integer id);

    List<Annonce> select2(@Param("course_id") String course_id);
}
