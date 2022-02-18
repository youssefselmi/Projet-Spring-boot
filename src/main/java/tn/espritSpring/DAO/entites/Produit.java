package tn.espritSpring.DAO.entites;


import java.util.Set;

import javax.persistence.*;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idProduit")
	private Long idProduit;
	
	@Column(name="code")
	private String code;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="prixUnitaire")
	private float prixUnitaire;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseurs;
	
	@ManyToOne
	private Rayon rayon;
	
	public Set<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}

	public void setFournisseurs(Set<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}

	public DetailProduit getDetailProduit() {
		return detailProduit;
	}

	public void setDetailProduit(DetailProduit detailProduit) {
		this.detailProduit = detailProduit;
	}

	public DetailFacture getDetailFacture() {
		return detailFacture;
	}

	public void setDetailFacture(DetailFacture detailFacture) {
		this.detailFacture = detailFacture;
	}

	public Rayon getRayon() {
		return rayon;
	}

	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@ManyToOne
	private Stock stock;
	
	@OneToOne
	private DetailProduit detailProduit;
	
	@ManyToOne
	private DetailFacture detailFacture;
	
	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Produit(Long idProduit, String code, String libelle, float prixUnitaire) {
		this.idProduit = idProduit;
		this.code = code;
		this.libelle = libelle;
		this.prixUnitaire = prixUnitaire;
	}

	public Produit() {}
	
	
	
	
	
	

}
