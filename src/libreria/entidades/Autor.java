/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gustavotorti
 */
@Entity
public class Autor implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String nombre;
     private boolean alta;

     public Autor() {
     }

     public Autor(String nombre, boolean alta) {
          //this.id = id;
          this.nombre = nombre;
          this.alta = alta;
     }

     public int getId() {
          return id;
     }

//     public void setId(int id) {
//          this.id = id;
//     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public boolean isAlta() {
          return alta;
     }

     public void setAlta(boolean alta) {
          this.alta = alta;
     }

     @Override
     public String toString() {
          return "Autor{" + "id=" + id + ", nombre=" + nombre + ", alta=" + alta + '}';
     }
     
     
}
