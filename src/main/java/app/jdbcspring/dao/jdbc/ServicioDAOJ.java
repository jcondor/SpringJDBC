/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.jdbcspring.dao.jdbc;

import app.jdbcspring.dao.ServicioDAO;
import app.jdbcspring.model.Servicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Administrador
 */
public class ServicioDAOJ extends JdbcDaoSupport implements ServicioDAO {

    public List list() {
        String sql = "select * from servicio";

        List<Servicio> servicios = new ArrayList<Servicio>();

        List<Map<String, Object>> rows = this.getJdbcTemplate().queryForList(sql);

        for (Map row : rows) {

            Servicio servicio = new Servicio();
            
            servicio.setId(Long.parseLong(String.valueOf(row.get("ID"))));
            servicio.setDescripcion((String) row.get("descripcion"));
            servicio.setCostoHora((Double) row.get("costo_hora"));
            servicios.add(servicio);
        }
        return servicios;
    }

    public Servicio get(Servicio t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void save(Servicio t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(Servicio t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Servicio t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
