/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefestival;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class ListaBilheteiras implements Serializable {
    private ArrayList <Bilheteira> bilheteiras;

    public ListaBilheteiras(ArrayList<Bilheteira> bilheteiras) {
        this.bilheteiras = bilheteiras;
    }

    public ListaBilheteiras() {
        this.bilheteiras=new ArrayList <>();
    }

    public ArrayList<Bilheteira> getBilheteiras() {
        return bilheteiras;
    }

    public void setBilheteiras(ArrayList<Bilheteira> bilheteiras) {
        this.bilheteiras = bilheteiras;
    }
    
    public float ganhoTotal(){
        float total=0;
        for (int i = 0; i < bilheteiras.size(); i++) {
         total=bilheteiras.get(i).getLucro()+total;
        }
        return total;
    }
    
    
}

