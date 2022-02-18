package tn.espritSpring.DAO.entites;
//import lombok.Getter;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column; import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity

//@Getter
//@Setter
@Table( name = "Client")			
public class Client implements Serializable {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idClient")
private Long idClient; // Clé primaire
private String nom;
private String prenom;
private String email;
private String password;
@Temporal(TemporalType.DATE)
private Date dateNaissance;




}

