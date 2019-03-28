package application.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Missionnaire;
import application.model.OrdMis;
import application.model.OrdMisPK;

@Repository
public interface Ord_MissRepository extends JpaRepository<OrdMis, OrdMisPK>{

	
	@Transactional
	@Modifying
	@Query("delete from OrdMis ord where  ord.ordMisPK.code=:i and ord.ordMisPK.cin=:j and ord.ordMisPK.numord=:k and ord.ordMisPK.numMission=:l ")
	int delete(@Param("i") String code,@Param("j") String cin,@Param("k") short numord,@Param("l") String numMission);

	
	//@Query("select o from Missionnaire o ,DeptGen p where p.code =:codeDept and  o.code= p.code ")
    @Query("select ord from OrdMis ord , Mission m where ord.ordMisPK.numMission=:num and ord.ordMisPK.numMission=m.missionPK.numMission")
	 List<OrdMis> getMissionnaireByNumMission(@Param ("num")String num);
    
}
