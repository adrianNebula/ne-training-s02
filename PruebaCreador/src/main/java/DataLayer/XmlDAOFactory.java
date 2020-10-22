/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author nesas-13
 */
public class XmlDAOFactory extends DAOFactory{
    
    public UserDAO userDAO = new XmlUserDAO();
    public VehicleDAO vehicleDAO = new XmlVehicleDao();

    @Override
    public UserDAO getUserDAO() {
        return userDAO;
    }
    
    @Override
    public VehicleDAO getVehicleDAO() {
        return vehicleDAO;
    }
}
