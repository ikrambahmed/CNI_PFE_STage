package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.AvoirBudget;
import application.model.AvoirFrais;
import application.service.AvoirBudgetDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AvoirBudgetController {
	@Autowired
	private AvoirBudgetDao avoirBudgetDao ; 
	
	
	@GetMapping("/listeBudget")
	public List<AvoirBudget> getFrais() {
		return avoirBudgetDao.findAll() ;  
	}
	
}
