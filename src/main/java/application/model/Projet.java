package application.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "PROJET")
@XmlRootElement
public class Projet implements Serializable{
	
	    @EmbeddedId
	    protected ProjetPK projetPK;
	    
	    @Column(name = "LIBPRJ_A")
	    private String libprjA;
	    
	    @Column(name = "LIB_PRJ_L")
	    private String libPrjL;
	    
	    @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)
	    @ManyToOne(optional = false)
	    private DeptGen dept;
	    
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projet")
	    private Collection<AvoirBudgetProjet> avoirBudgetProjetCollection;

	    public Projet() {
	    }

		public Projet(ProjetPK projetPK, String libprjA, String libPrjL) {
			super();
			this.projetPK = projetPK;
			this.libprjA = libprjA;
			this.libPrjL = libPrjL;
		}

		public ProjetPK getProjetPK() {
			return projetPK;
		}

		public void setProjetPK(ProjetPK projetPK) {
			this.projetPK = projetPK;
		}

		public String getLibprjA() {
			return libprjA;
		}

		public void setLibprjA(String libprjA) {
			this.libprjA = libprjA;
		}

		public String getLibPrjL() {
			return libPrjL;
		}

		public void setLibPrjL(String libPrjL) {
			this.libPrjL = libPrjL;
		}
	    
	    
}
