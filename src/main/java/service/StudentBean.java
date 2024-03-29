package service;

import modele.Student;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.*;

import java.util.List;

@Named
@RequestScoped
public class StudentBean {


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDB");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    private List<Student> students;


    public StudentBean() {
        Query q = em.createNamedQuery("student.findAll");
        students = q.getResultList();
    }


    public List<Student> getStudents() {
        return students;
    }
}
