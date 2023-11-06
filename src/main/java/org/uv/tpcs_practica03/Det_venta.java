package org.uv.tpcs_practica03;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author francisco
 */

@Entity(name = "Det_venta")
public class Det_venta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//OCUPAR IDENTYTY
    private long id ;
    
    @Column
    private int id_producto;
    @Column
    private int cantidad;
    @Column
    private String descipcion;
    @Column
    private int Precio;
    public int getId() {
        return (int) id;
    }
    
      public void setId(int id) {
        this.id = id;
    }
    

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

   


}
