/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nesas-13
 */
public class XmlVehicleDao implements VehicleDAO{
    
    @Override
    public void createVehicle(String placa, String desc, String marca) {
        System.out.println("XmlVehicleDao.createVehicle: " + placa+ ", " + desc +", "+marca);
    
            try {
            FileWriter myWriter = new FileWriter("/tmp/lab/"+placa+".txt");
            myWriter.write(desc);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
}
}