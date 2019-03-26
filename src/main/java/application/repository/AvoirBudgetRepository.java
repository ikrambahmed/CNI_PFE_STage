package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.AvoirBudget;
import application.model.AvoirBudgetPK;

@Repository
public interface  AvoirBudgetRepository extends JpaRepository<AvoirBudget, AvoirBudgetPK>
{}
