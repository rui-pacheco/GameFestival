/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import gamefestival.Festival;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Rui
 */
public class BaseDados {
     
    private final File ficheiro;

    public BaseDados(String ficheiro) {
          this.ficheiro = new File(ficheiro);  
        }

    public File getFicheiro() {
        return ficheiro;
    }          
    
    
    public Festival carregar() {
        try (FileInputStream fileIn = new FileInputStream(ficheiro); 
        ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Festival festival = (Festival) in.readObject();
            return festival;
        }catch(IOException | ClassNotFoundException ex) {
            throw new RuntimeException(String.format(
                  "Ocorreu um erro ao ler o ficheiro de dados: %s", 
                  ex.getLocalizedMessage()), ex);        
        }              
    }
    
    //Guarda o sistema em ficheiro
    public void guardar(Festival festival) {
        try (FileOutputStream fileOut = new FileOutputStream(ficheiro); 
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            try {
                out.writeObject(festival);
            } catch (IOException ex) {
                throw new RuntimeException(String.format(
                        "Ocorreu um erro ao guardar o ficheiro de dados: %s", 
                        ex.getLocalizedMessage()), ex);
            }
        } catch (IOException ex) {
             throw new RuntimeException(String.format(
                        "Ocorreu um erro ao guardar o ficheiro de dados: %s", 
                        ex.getLocalizedMessage()), ex);
        }
    }
    
}
