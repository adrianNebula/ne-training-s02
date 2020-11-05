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
public class JsonUserDAO implements UserDAO{
    
    @Override
    public void createUser(String id, String desc, String name) {
        System.out.println("JsonUserDAO.createUser: " + id + ", " + desc +", "+name);
        try {
            File fileToCreate = new File("/tmp/lab/json");
            fileToCreate.mkdir();
            FileWriter myWriter = new FileWriter("/tmp/lab/json/"+id+".txt");
            myWriter.write("Nombre : "+ name + "\nDescripcion : "+ desc);
            myWriter.close();   
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
