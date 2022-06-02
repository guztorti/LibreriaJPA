/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author gustavotorti
 */
@Entity
public class Libro implements Serializable {
     @Id 
     private String isbn;
     private String titulo;
     private int anio;
     private int ejemplares;
     private int ejemplaresPrestados;
     private int ejemplaresRestantes;
     private boolean alta;
     @OneToOne
     private Autor autor;
     @OneToOne
     private Editorial editorial;

     public Libro() {
     }

     public Libro(String isbn, String titulo, int anio, int ejemplares, int ejemplaresPrestados, int ejemplaresRestantes, boolean alta, Autor autor, Editorial editorial) {
          this.isbn = isbn;
          this.titulo = titulo;
          this.anio = anio;
          this.ejemplares = ejemplares;
          this.ejemplaresPrestados = ejemplaresPrestados;
          this.ejemplaresRestantes = ejemplaresRestantes;
          this.alta = alta;
          this.autor = autor;
          this.editorial = editorial;
     }

     public String getIsbn() {
          return isbn;
     }

     public void setIsbn(String isbn) {
          this.isbn = isbn;
     }

     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public int getAnio() {
          return anio;
     }

     public void setAnio(int anio) {
          this.anio = anio;
     }

     public int getEjemplares() {
          return ejemplares;
     }

     public void setEjemplares(int ejemplares) {
          this.ejemplares = ejemplares;
     }

     public int getEjemplaresPrestados() {
          return ejemplaresPrestados;
     }

     public void setEjemplaresPrestados(int ejemplaresPrestados) {
          this.ejemplaresPrestados = ejemplaresPrestados;
     }

     public int getEjemplaresRestantes() {
          return ejemplaresRestantes;
     }

     public void setEjemplaresRestantes(int ejemplaresRestantes) {
          this.ejemplaresRestantes = ejemplaresRestantes;
     }

     public boolean isAlta() {
          return alta;
     }

     public void setAlta(boolean alta) {
          this.alta = alta;
     }

     public Autor getAutor() {
          return autor;
     }

     public void setAutor(Autor autor) {
          this.autor = autor;
     }

     public Editorial getEditorial() {
          return editorial;
     }

     public void setEditorial(Editorial editorial) {
          this.editorial = editorial;
     }

     @Override
     public String toString() {
          return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", ejemplares=" + ejemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + ", ejemplaresRestantes=" + ejemplaresRestantes + ", alta=" + alta + ", autor=" + autor + ", editorial=" + editorial + '}';
     }
     
     
}
