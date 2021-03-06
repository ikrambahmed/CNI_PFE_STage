package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.AvoirBudgetProjet;
import application.repository.AvoirBudgetProjetRepository;
@Service
@Primary
public class AvoirBudgetProjetDao implements IAvoirBudgetProjet{
@Autowired
AvoirBudgetProjetRepository avoirBudgetRep ; 
	
@Override
	public List<AvoirBudgetProjet> findAll() {
		return avoirBudgetRep.findAll();
	}

}