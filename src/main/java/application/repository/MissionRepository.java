package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import application.model.Mission;
import application.model.MissionPK;

@Repository
public interface MissionRepository extends JpaRepository<Mission, MissionPK> {
	@Query("select o from Mission o ,DeptGen p where p.code =:codeDept and o.deptGen= p.code ")
	List<Mission> findMissionByDept(String codeDept);
}
