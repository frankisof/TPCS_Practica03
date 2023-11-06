package org.uv.tpcs_practica03;


import java.util.Properties;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *  @author francisco
 */
public class Hibernetutil {
   private static SessionFactory sessionFactory;
   
   public static SessionFactory getSessionFactory(){
   if (sessionFactory==null){
     Configuration  configuration = new org.hibernate.cfg.Configuration();
       Properties settings = new Properties();
      settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
       settings.put(Environment.URL, "jdbc:mysql://localhost:3306/tiendita?characterEncoding=UTF-8");
        settings.put(Environment.USER, "crud");
        settings.put(Environment.PASS, "password");
        
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, "none");
        configuration.setProperties(settings);
        
        //agregar los pojos como entity
configuration.addAnnotatedClass(Cliente.class);
configuration.addAnnotatedClass(Det_venta.class);
configuration.addAnnotatedClass(Producto.class);
configuration.addAnnotatedClass(Venta.class);
StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        .applySettings(configuration.getProperties()).build();
sessionFactory= configuration.buildSessionFactory((org.hibernate.service.ServiceRegistry)serviceRegistry);
   }
   return sessionFactory;
   }
}
