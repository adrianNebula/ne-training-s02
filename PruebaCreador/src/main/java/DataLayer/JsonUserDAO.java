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
public class JsonUserDAO implements UserDAO{
    
    @Override
    public void createUser(String id, String desc, String name) {
        System.out.println("JsonUserDAO.createUser: " + id + ", " + desc +", "+name);
    }
    
}
