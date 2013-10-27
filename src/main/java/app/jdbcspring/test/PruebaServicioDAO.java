/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.jdbcspring.test;

import app.jdbcspring.dao.ServicioDAO;
import app.jdbcspring.model.Servicio;
import app.zelper.GenericDAO;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrador
 */
public class PruebaServicioDAO {
    public static void main(String[] args) {
        PruebaServicioDAO.getAll();
    }
    
    public static void getAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_database.xml");

        GenericDAO servicioDAO = (GenericDAO) context.getBean("perrito");
        List<Servicio> servicios = servicioDAO.list();
        for (Servicio servicio : servicios) {
            System.out.println(servicio.getId()+" "+servicio.getDescripcion() + " " + servicio.getCostoHora());
        }
    }
    
}
