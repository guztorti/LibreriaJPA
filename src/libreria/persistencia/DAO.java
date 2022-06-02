/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gustavotorti
 */
public abstract class DAO {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaPU");
      EntityManager em = emf.createEntityManager();
      
      public int crearDAO(Object o) throws Exception{
           //String mensaje = "No se creo el " + o.getClass() + " solicitado";
           try {
                em.isOpen();
                em.getTransaction().begin();
                em.persist(o);
                em.getTransaction().commit();
                em.close();
                return 0;
           } catch (Exception e) {
                em.close();
                return -1;
           }
      }
      
      public int modificarDAO(Object o) throws Exception{
           try {
                em.isOpen();
                em.getTransaction().begin();
                em.merge(o);
                em.getTransaction().commit();
                em.close();
                return 0;
           } catch (Exception e) {
                em.close();
                return -1;
           }
      }
      
      public ArrayList<Object> consultarDAO(String query){
           ArrayList retorno ;
           
           em.isOpen();
           retorno = (ArrayList) em.createQuery(query).getResultList();
           em.close();
           return retorno;
      }
}
