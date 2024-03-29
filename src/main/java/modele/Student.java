package modele;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
@NamedQueries({
@NamedQuery(name="student.findAll", query="SELECT student FROM Student student")
})
public class Student  {
    @Id
    private int id;
    private String nom;
    private String prenom;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Adresse adresse;

    public Student() {
    }

    public Student(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Student(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Student(int id, String nom, String prenom, Adresse adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }


}
