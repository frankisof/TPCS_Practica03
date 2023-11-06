/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.tpcs_practica03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author francisco
 */
public class TPCS_Practica03 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
        String fechaStr = "12/12/12";
        Date fecha = formatoFecha.parse(fechaStr);
        Venta venta = new Venta();
        venta.setFecha(fecha);
        venta.setID_Cliente(1);
       venta.setTotal(1245);
        
////        System.out.println("Hello World!");
 
        Cliente cliente = new Cliente();
      
        cliente.setNombre("francisco");
        cliente.setRfc(12134566);
      
//        Producto producto = new Producto();
//        producto.setCosto(80);
//        producto.setDesciption("Cereal");
//        producto.setExistencia(3);
//        producto.setPrecio( 100);
        
         Producto producto2 = new Producto();
        producto2.setCosto(50);
        producto2.setDesciption("Paquete de galletas");
        producto2.setExistencia(4);
        producto2.setPrecio( 70);
        
         Producto producto3 = new Producto();
        producto3.setCosto(30);
        producto3.setDesciption("Jabon liquido para ropa");
        producto3.setExistencia(10);
        producto3.setPrecio( 50);
//   
            Session sesion = Hibernetutil.getSessionFactory().openSession();
      Transaction t= sesion.beginTransaction();
//        sesion.save(cliente);
//             sesion.save(venta);
//                  sesion.save(producto);
                   sesion.save(producto2);
                    sesion.save(producto3);
        t.commit();
        sesion.close();
        
    
        
        
//try {
//    // Crear un nuevo cliente
//    Cliente cliente = new Cliente();
//    cliente.setNombre("francisco");
//    cliente.setRfc(1234);
//    
//    // Guardar el cliente en la base de datos
//    sesion.save(cliente);
//
//    // Crear una nueva venta asociada al cliente
//    Venta venta = new Venta();
//    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
//     String fechaStr = "12/12/12";
//    Date fecha = formatoFecha.parse(fechaStr);
//    venta.setFecha(fecha);  // Establecer la fecha de la venta
//    venta.setID_Cliente(1);  // Establecer la relación con el cliente
//    venta.setTotal(1245);
//
//    // Guardar la venta en la base de datos
//    sesion.save(venta);
//
//    // Commit para confirmar los cambios
//    transaction.commit();
//} catch (Exception e) {
//    // En caso de error, realizar rollback
//    if (transaction != null) {
//        //transaction.rollback();
//    }
//    e.printStackTrace();
//} finally {
//    // Cerrar la sesión de Hibernate
//    sesion.close();
//}
//    }

    }
}