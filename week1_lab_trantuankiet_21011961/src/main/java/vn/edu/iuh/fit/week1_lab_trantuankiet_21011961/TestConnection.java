package vn.edu.iuh.fit.week1_lab_trantuankiet_21011961;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TestConnection {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("MariaDB").createEntityManager();

        em.close();
    }
}
