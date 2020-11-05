/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.DAOFactory;
import Data.VehicleDAO;
import TOOLS.Encryptor;

/**
 *
 * @author nesas-13
 */
public class VehicleManager {
    
    private static VehicleManager instance = null;
    
    /**
     *
     * @return
     */
    public static VehicleManager getInstance(){
    if (VehicleManager.instance == null){
        instance = new VehicleManager();
    }
    return VehicleManager.instance;

}
     private VehicleManager(){
         
     }
     
    /**
     *
     * @param placa
     * @param desc
     * @param marca
     */
    public void createVehicle(String placa, String desc, String marca, String selectedType){
        
        Encryptor aesWithCbc = new Encryptor()
                .type(Encryptor.TYPES.AES)
                .cbc(true)
                .publicKey("my publi key")
                .secret("password");
        Encryptor tripleDESnoCBC = new Encryptor()
                .type(Encryptor.TYPES.TRIPLEDES)
                .cbc(false)
                .secret("password");
        
        
        String encrypt = aesWithCbc.encrypt(placa);
        String encrypt2 = tripleDESnoCBC.encrypt(placa);
        
        
    System.out.println("VehicleManager.createVehicle"+placa+","+desc+","+marca);
            
    DAOFactory daoFactory = DAOFactory.getDAOFactory(selectedType.equals("JSON") ? DAOFactory.JSON : DAOFactory.XML);        
               
        
        VehicleDAO vehicleDAO = daoFactory.getVehicleDAO();
        vehicleDAO.createVehicle(placa, desc,marca);
}
}