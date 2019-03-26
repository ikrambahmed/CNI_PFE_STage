package application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "AVOIR_BUDGET_PROJET")
@XmlRootElement
public class AvoirBudgetProjet implements Serializable{
	     @EmbeddedId
	     protected AvoirBudgetProjetPK avoirBudgetProjetPK;
	     
	     @Column(name = "REFERENCE")
	     private String reference;
	    
	     @Column(name = "VALEUR")
	     private BigDecimal valeur;
	     @Column(name = "DATE_VAL")
	     private Date dateVal;
	     
	     @Column(name = "COD_UTIL")
	     private String codUtil;
	     
	     @Column(name = "TYPE_BUDGETP")
	     private String typeBudgetp;
	    
	     @JoinColumns({
	         @JoinColumn(name = "COD_PRJ", referencedColumnName = "COD_PRJ", insertable = false, updatable = false)
	         , @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)})
	     @ManyToOne(optional = false)
	     private Projet projet;

	     public AvoirBudgetProjet() {
	    
	     }

		public AvoirBudgetProjet(AvoirBudgetProjetPK avoirBudgetProjetPK, String reference, BigDecimal valeur,
				Date dateVal, String codUtil, String typeBudgetp) {
			super();
			this.avoirBudgetProjetPK = avoirBudgetProjetPK;
			this.reference = reference;
			this.valeur = valeur;
			this.dateVal = dateVal;
			this.codUtil = codUtil;
			this.typeBudgetp = typeBudgetp;
		}

		public AvoirBudgetProjetPK getAvoirBudgetProjetPK() {
			return avoirBudgetProjetPK;
		}

		public void setAvoirBudgetProjetPK(AvoirBudgetProjetPK avoirBudgetProjetPK) {
			this.avoirBudgetProjetPK = avoirBudgetProjetPK;
		}

		public String getReference() {
			return reference;
		}

		public void setReference(String reference) {
			this.reference = reference;
		}

		public BigDecimal getValeur() {
			return valeur;
		}

		public void setValeur(BigDecimal valeur) {
			this.valeur = valeur;
		}

		public Date getDateVal() {
			return dateVal;
		}

		public void setDateVal(Date dateVal) {
			this.dateVal = dateVal;
		}

		public String getCodUtil() {
			return codUtil;
		}

		public void setCodUtil(String codUtil) {
			this.codUtil = codUtil;
		}

		public String getTypeBudgetp() {
			return typeBudgetp;
		}

		public void setTypeBudgetp(String typeBudgetp) {
			this.typeBudgetp = typeBudgetp;
		}
	     
}
