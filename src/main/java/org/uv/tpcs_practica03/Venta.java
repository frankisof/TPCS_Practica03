package org.uv.tpcs_practica03;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author francisco
 */

@Entity(name = "Venta")
public class Venta {
    @Id
    private long id ;
    
    @Column
    private Date Fecha;
    @Column
    private int ID_Cliente;
    @Column
    private int Total;
     @ManyToOne
 @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;
  
    public long getId() {
        return id;
    }
  public void setId(int id){
    this.id= id;
    }
    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }


   


}
