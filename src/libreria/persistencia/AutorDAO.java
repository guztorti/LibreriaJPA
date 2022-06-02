/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.entidades.Autor;

/**
 *
 * @author gustavotorti
 */
public final class AutorDAO extends DAO {

     public int crearAutorDAO(Autor a1) throws Exception {

          try {
               if (crearDAO(a1) == 0) {
                    return crearDAO(a1);
               }
          } catch (Exception ex) {

               throw ex;
          }
          return 1;
     }
}
