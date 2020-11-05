/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.DAOFactory;
import Data.UserDAO;
import TOOLS.Encryptor;

/**
 *
 * @author nesas-13
 */
public class userManager {

    private static userManager instance = null;

    /**
     *
     * @return
     */
    public static userManager getInstance() {
        if (userManager.instance == null) {
            instance = new userManager();
        }
        return userManager.instance;

    }

    private userManager() {

    }

    /**
     *
     * @param id
     * @param desc
     * @param name
     */
    public void createUser(String id, String desc, String name, String selectedType) {

        Encryptor aesWithCbc = new Encryptor()
                .type(Encryptor.TYPES.AES)
                .cbc(true)
                .publicKey("my publi key")
                .secret("password");
        Encryptor tripleDESnoCBC = new Encryptor()
                .type(Encryptor.TYPES.TRIPLEDES)
                .cbc(false)
                .secret("password");

        String encrypt = aesWithCbc.encrypt(id);
        String encrypt2 = tripleDESnoCBC.encrypt(id);
        System.out.println("userManager.createUser" + id + "," + desc + "," + name);

        DAOFactory daoFactory = DAOFactory.getDAOFactory(selectedType.equals("JSON") ? DAOFactory.JSON : DAOFactory.XML);

        UserDAO userDAO = daoFactory.getUserDAO();
        userDAO.createUser(id, desc, name);

    }

}
