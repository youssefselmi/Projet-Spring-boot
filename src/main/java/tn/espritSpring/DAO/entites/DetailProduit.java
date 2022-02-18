package tn.espritSpring.DAO.entites;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class DetailProduit {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailProduit")
	private Long idDetailProduit;
	
	@Column(name="dateCreation")
	private Date dateCreation;
	
	@Column(name="dateDerniereModification")
	private String dateDerniereModification;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="categorieProduit")
	private CategorieProduit categorieProduit;
	
	@OneToOne(mappedBy="detailProduit")
	private Produit produit;

	public Long getIdDetailProduit() {
		return idDetailProduit;
	}

	public void setIdDetailProduit(Long idDetailProduit) {
		this.idDetailProduit = idDetailProduit;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(String dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public CategorieProduit getCategorieProduit() {
		return categorieProduit;
	}

	public void setCategorieProduit(CategorieProduit categorieProduit) {
		this.categorieProduit = categorieProduit;
	}

	public DetailProduit(Long idDetailProduit, Date dateCreation, String dateDerniereModification,
			CategorieProduit categorieProduit) {
		this.idDetailProduit = idDetailProduit;
		this.dateCreation = dateCreation;
		this.dateDerniereModification = dateDerniereModification;
		this.categorieProduit = categorieProduit;
	}

	public DetailProduit() {}
	
	
	
	
	
	
}
