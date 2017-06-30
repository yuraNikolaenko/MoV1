package ua.in.mov.dao;

import ua.in.mov.tables.Vehicle;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by yura on 30.06.2017.
 */

@Stateless
public class VehicleDAO {
    @PersistenceContext
    EntityManager em;

public List<Vehicle> findAll(){
    return  em.createQuery("select v from Vehicle v").getResultList();
}

}
