/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import BussinesLayer.userManager;
import BussinesLayer.VehicleManager;

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
    public static  void createUser(String id, String desc, String name){      
        System.out.println("MainGateway.createUser: "+ id +", "+ desc +","+name);
        userManager.getInstance().createUser(id, desc, name);
    }
    
    /**
     *
     * @param placa
     * @param desc
     * @param marca
     */
    public static  void createVehicle(String placa, String desc, String marca){      
        System.out.println("MainGateway.createVehicle: "+ placa +", "+ desc +","+marca);
        VehicleManager.getInstance().createVehicle(placa, desc, marca);
    
}
}    
