package ca.usherbrooke.gegi.server.dao;

import ca.usherbrooke.gegi.server.dto.Etudiant;
import org.apache.ibatis.annotations.Param;
import org.mybatis.cdi.Mapper;

import java.util.List;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@Mapper
public interface EtudiantMapper {

    List<Etudiant> select(@Param("id") Integer id);
}
