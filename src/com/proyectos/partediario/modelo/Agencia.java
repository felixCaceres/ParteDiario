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
public class Agencia implements Serializable {
    
    private Long    id;
    
    private String  nombre;
    private String  telefono;
    private String  interno_secretaria;
    private String  interno_reclamos;
    private String  celular_reclamos;

    public String getInternoSecretaria() {
        return interno_secretaria;
    }

    public void setInternoSecretaria(String interno_secretaria) {
        this.interno_secretaria = interno_secretaria;
    }
    @Column
    public String getInternoReclamos() {
        return interno_reclamos;
    }

    public void setInternoReclamos(String interno_reclamos) {
        this.interno_reclamos = interno_reclamos;
    }
    @Column
    public String getCelularReclamos() {
        return celular_reclamos;
    }

    public void setCelularReclamos(String celular_reclamos) {
        this.celular_reclamos = celular_reclamos;
    }
    
    
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
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
