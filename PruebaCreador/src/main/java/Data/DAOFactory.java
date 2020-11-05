/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


/**
 *
 * @author nesas-13
 */
public abstract class DAOFactory {
    
       // Definimos unas constantes por cada base de datos
    public static final int JSON = 1;
    public static final int XML = 2;
    
 
    // Existirá un método get por cada DAO que exista en el sistema
    public abstract UserDAO getUserDAO();
    public abstract VehicleDAO getVehicleDAO();
 
    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case JSON:
                return new JsonDAOFactory();
            case XML:
                return new XmlDAOFactory();
            default:
                return null;
        }
    }
    
}
