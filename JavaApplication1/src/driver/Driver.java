package driver;

import java.io.FileNotFoundException;
import java.io.IOException;
import aplikasiConsole.Aplikasi;
import controller.Controller;

/**
 *
 * @author 
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        Aplikasi a = new Aplikasi();
        new Controller(a);
        a.mainMenu();
    }
    
}
