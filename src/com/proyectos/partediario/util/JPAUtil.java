/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectos.partediario.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author asu05874
 */
public class JPAUtil {

    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            // Create the SessionFactory from a JPA configuration (persistence.xml)
            entityManagerFactory =
                    Persistence.createEntityManagerFactory("partediarioPU");
            
            
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial EntityManagerFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
