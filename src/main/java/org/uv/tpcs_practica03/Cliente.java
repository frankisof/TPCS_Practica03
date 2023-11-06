package org.uv.tpcs_practica03;
import java.util.List;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author francisco
 */

@Entity(name = "Cliente")
public class Cliente {
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//OCUPAR IDENTYTY
    @Column(name = "id") 
    private long id ;
   
    @Column
    private String Nombre;
    @Column
    private int Rfc;
    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventas;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRfc() {
        return Rfc;
    }

    public void setRfc(int Rfc) {
        this.Rfc = Rfc;
    }

    
   


}
