/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nesas-13
 */
public class JsonVehicleDAO implements VehicleDAO{
    
    @Override
    public void createVehicle(String placa, String desc, String marca) {
        System.out.println("JsonVehicleDao.createVehicle: " + placa+ ", " + desc +", "+marca);
    
            try {
            File fileToCreate = new File("/tmp/lab/JsonV");
            fileToCreate.mkdir();
            FileWriter myWriter = new FileWriter("/tmp/lab/JsonV/"+placa+".txt");
            myWriter.write("Marca : "+ marca + "\nDescripcion : "+ desc);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
}
}