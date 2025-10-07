package com.mycompany.videojuegojpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class VideojuegoJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideojuegosPU");
        EntityManager em = emf.createEntityManager();
    }
}
