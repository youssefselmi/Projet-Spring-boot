package tn.espritSpring.DAO.entites;

import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Facture {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idFacture")
	private Long idFacture;
	
	@Column(name="montantRemise")
	private float montantRemise;
	
	@Column(name="montantFacture")
	private float montantFacture;
	
	@Column(name="dateFacture")
	private Date dateFacture;
	
	@Column(name="active")
	private Boolean active;
	
	@ManyToOne
	private Client client;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="facture")
	private Set<DetailFacture> detailsFactures;

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public float getMontantFacture() {
		return montantFacture;
	}

	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Facture(Long idFacture, float montantRemise, float montantFacture, Date dateFacture, Boolean active) {
		this.idFacture = idFacture;
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.active = active;
	}

	public Facture() {}
	
	
	
	
	

}
