/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author gustavotorti
 */
public class AutorServicio {
     AutorDAO dao = new AutorDAO();
     
     public Autor crearAutor() throws Exception{
          
          Autor a1 = new Autor("C. S. Lewis", true);
          try {
               if (dao.crearAutorDAO(a1)==0) {
                    return new Autor();
               }
          } catch (Exception ex) {
               throw ex;
          }
          return null;
     }
}
