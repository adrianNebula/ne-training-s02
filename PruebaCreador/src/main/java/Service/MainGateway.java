/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bussines.userManager;
import Bussines.VehicleManager;

/**
 *
 * @author nesas-13
 */
public class MainGateway {
    
    /**
     *
     * @param id
     * @param desc
     * @param name
     */
    public static  void createUser(String id, String desc, String name, String selectedType){      
        System.out.println("MainGateway.createUser: "+ id +", "+ desc +","+name);
        userManager.getInstance().createUser(id, desc, name,selectedType);
    }
    
    /**
     *
     * @param placa
     * @param desc
     * @param marca
     */
    public static  void createVehicle(String placa, String desc, String marca, String selectedType){      
        System.out.println("MainGateway.createVehicle: "+ placa +", "+ desc +","+marca);
        VehicleManager.getInstance().createVehicle(placa, desc, marca, selectedType);
    
}
}    
