package tn.espritSpring.DAO.entites;

import java.util.Set;

import javax.persistence.*;

@Entity
public class DetailFacture {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailFacture")
	private Long idDetailFacture;
	
	@Column(name="qte")
	private int qte;
	
	@Column(name="prixTotal")
	private float prixTotal;
	
	@Column(name="pourcentageRemise")
	private int pourcentageRemise;
	
	@Column(name="montantRemise")
	private float montantRemise;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="detailFacture")
	private Set<Produit> produits;
	
	@ManyToOne
	private Facture facture;

	public Long getIdDetailFacture() {
		return idDetailFacture;
	}

	public void setIdDetailFacture(Long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public int getPourcentageRemise() {
		return pourcentageRemise;
	}

	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public DetailFacture(Long idDetailFacture, int qte, float prixTotal, int pourcentageRemise, float montantRemise) {
		this.idDetailFacture = idDetailFacture;
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
	}

	public DetailFacture() {}
	
	
	
	

}
