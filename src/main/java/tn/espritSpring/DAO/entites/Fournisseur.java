package tn.espritSpring.DAO.entites;

import java.util.Date;

import javax.persistence.*;

@Entity
//@Getter
//@Setter
public class Fournisseur {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idFournisseur")
	private Long idFournisseur;
	
	@Column(name="code")
	private String code;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="image_fournisseur")
	private String image_fournisseur;
	
	//@Column(name="date_fin_contrat")
	@Temporal(TemporalType.DATE)
	private Date date_fin_contrat;
	
	
	@Column(name="likeFournisseur",nullable=true)
   

	private int likeFournisseur;
	
	@Column(name="email_fournisseur")
	private String email_fournisseur;
	
	
	
	

	
	public String getEmail_fournisseur() {
		return email_fournisseur;
	}

	public void setEmail_fournisseur(String email_fournisseur) {
		this.email_fournisseur = email_fournisseur;
	}

	public int getLikeFournisseur() {
		return likeFournisseur;
	}

	public void setLikeFournisseur(int likeFournisseur) {
		this.likeFournisseur = likeFournisseur;
	}

	public String getImage_fournisseur() {
		return image_fournisseur;
	}

	public void setImage_fournisseur(String image_fournisseur) {
		this.image_fournisseur = image_fournisseur;
	}

	public Date getDate_fin_contrat() {
		return date_fin_contrat;
	}

	public void setDate_fin_contrat(Date date_fin_contrat) {
		this.date_fin_contrat = date_fin_contrat;
	}

	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
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


	public Fournisseur(Long idFournisseur, String code, String libelle, String image_fournisseur, Date date_fin_contrat, int likeFournisseur, String email_fournisseur
			) {
		super();
		this.idFournisseur = idFournisseur;
		this.code = code;
		this.libelle = libelle;
		this.image_fournisseur = image_fournisseur;
		this.date_fin_contrat = date_fin_contrat;
		this.likeFournisseur = likeFournisseur;
		this.email_fournisseur = email_fournisseur;
	}

	public Fournisseur() {}
	
	
	
	

}
