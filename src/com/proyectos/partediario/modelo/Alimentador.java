/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectos.partediario.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author asu05874
 */
@Entity
public class Alimentador implements Serializable {
    private Long    id;
    
    private String  nombre;
    private String  centrodedistribucion;
    
    
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    @Column(name="id")
    public Long getId() {
    return id;
    }
    
     
    public void setId(Long id) {
        this.id = id;
    }
    @Column
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Column
    public String getCentrodedistribucion() {
        return centrodedistribucion;
    }

    public void setCentrodedistribucion(String centrodedistribucion) {
        this.centrodedistribucion = centrodedistribucion;
    }

    
}
