package tn.espritSpring.DAO.entites;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Rayon {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idRayon")
	 Long idRayon;
	
	@Column(name="code")
	 String code;
	
	@Column(name="libelle")
	 String libelle;
	
	
	@Column(name="qte_maximale")
	 int qte_maximale;
	
	
	
	
	
	public int getQte_maximale() {
		return qte_maximale;
	}

	public void setQte_maximale(int qte_maximale) {
		this.qte_maximale = qte_maximale;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="rayon")
	private Set<Produit> produits;

	public Long getIdRayon() {
		return idRayon;
	}

	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
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

	public Rayon(Long idRayon, String code, String libelle, int qte_maximale) {
		this.idRayon = idRayon;
		this.code = code;
		this.libelle = libelle;
		this.qte_maximale = qte_maximale;
	}

	public Rayon() {}
	
	

}
