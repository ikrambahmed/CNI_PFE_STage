package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.AvoirBudget;
import application.model.Classe;
import application.repository.AvoirBudgetRepository;
import application.repository.ClasseRepository;
@Service
@Primary
public class AvoirBudgetDao implements IAvoirBudget{

	@Autowired
	AvoirBudgetRepository avoirBudgetRepository;
	
	@Override
	public List<AvoirBudget> findAll(){
		return avoirBudgetRepository.findAll();
	}
	
}
