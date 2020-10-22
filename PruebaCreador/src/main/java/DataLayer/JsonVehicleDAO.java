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
public class JsonVehicleDAO implements VehicleDAO{
    
    @Override
    public void createVehicle(String placa, String desc, String marca) {
        System.out.println("JsonVehicleDAO.createVehicle: " + placa + ", " + desc + ", "+marca);
    }
}
