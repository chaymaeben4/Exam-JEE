package modele;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    private int id;
    private String numero_rue;
    private String nom_rue;
    private String ville;
    private String code_postal;
    private String pays;

    public Adresse(int id,  String numero_rue, String nom_rue, String ville, String code_postal, String pays) {
        this.id = id;

        this.numero_rue = numero_rue;
        this.nom_rue = nom_rue;
        this.ville = ville;
        this.code_postal = code_postal;
        this.pays = pays;
    }

    public Adresse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNumero_rue() {
        return numero_rue;
    }

    public void setNumero_rue(String numero_rue) {
        this.numero_rue = numero_rue;
    }

    public String getNom_rue() {
        return nom_rue;
    }

    public void setNom_rue(String nom_rue) {
        this.nom_rue = nom_rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
