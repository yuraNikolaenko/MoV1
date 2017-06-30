package ua.in.mov.beans;

import ua.in.mov.dao.VehicleDAO;
import ua.in.mov.tables.Vehicle;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.management.MXBean;
import java.util.List;


@ManagedBean
public class VehicleBean {

    @EJB
    VehicleDAO vehicleDAO;

    public List<Vehicle> getVehicles(){
        return vehicleDAO.findAll();
    }



}
