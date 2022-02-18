package tn.espritSpring.DAO.entites;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Stock {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idStock")
	private long idStock;
	
	@Column(name="qte")
	private int qte;
	
	@Column(name="qteMin")
	private int qteMin;
	
	@Column(name="libelleStock")
	private String libelleStock;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
	private Set<Produit> produits;

	public long getIdStock() {
		return idStock;
	}

	public void setIdStock(long idStock) {
		this.idStock = idStock;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public int getQteMin() {
		return qteMin;
	}

	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}

	public String getLibelleStock() {
		return libelleStock;
	}

	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}

	public Stock(long idStock, int qte, int qteMin, String libelleStock) {
		this.idStock = idStock;
		this.qte = qte;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
	}

	public Stock() {}
	
	
	
	

}
