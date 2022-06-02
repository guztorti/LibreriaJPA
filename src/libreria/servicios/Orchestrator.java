/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Scanner;


/**
 *
 * @author gustavotorti
 */
public class Orchestrator {
     Scanner scn;
     AutorServicio as = new AutorServicio();
     public Orchestrator(){
          scn = new Scanner(System.in).useDelimiter("\n");
          String mensaje = "ingrese una opcion:\n"
                  + "a) crear Autor";
          char opcion;
          do {               
               opcion = scn.next().toLowerCase().charAt(1);
               switch (opcion){
                    case 'a':
                         as.crearAutor();
               }
          } while (opcion != 'z');
     }
}
