package javaapplication1;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Luthfi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        Aplikasi a = new Aplikasi();
        a.mainMenu();
    }
    
}
