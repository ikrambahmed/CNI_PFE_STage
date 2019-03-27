package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.AvoirFrais;
import application.model.AvoirFraisPK;
import application.model.Missionnaire;

@Repository
public interface AvoirFraisRepository extends JpaRepository<AvoirFrais, AvoirFraisPK> {
	
	@Query("select o from AvoirFrais  a , OrdMis o , Mission m where a.ordMis.ordMisPK.numMission=o.mission.missionPK.numMission and o.mission.missionPK.numMission=m.missionPK.numMission and m.missionPK.numMission=:num")
	public List<AvoirFrais> getFraisByMission(@Param("num")String num);
	
	}
