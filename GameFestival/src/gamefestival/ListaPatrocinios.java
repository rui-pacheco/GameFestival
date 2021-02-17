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
public class ListaPatrocinios implements Serializable {
    ArrayList<Patrocinio> listaPatrocinios;

    public ListaPatrocinios(ArrayList<Patrocinio> listaPatrocinios) {
        this.listaPatrocinios = listaPatrocinios;
    }

    public ListaPatrocinios() {
        this.listaPatrocinios = new ArrayList();
    }

    public ArrayList<Patrocinio> getListaPatrocinios() {
        return listaPatrocinios;
    }

    public void setListaPatrocinios(ArrayList<Patrocinio> listaPatrocinios) {
        this.listaPatrocinios = listaPatrocinios;
    }
    public float getReceitaPatrocinios(){
        float lucro=0;
        for (Patrocinio patrocinio : listaPatrocinios) {
            lucro=lucro+patrocinio.getContribuicao();
        }
        return lucro;
    }
        
    public void add(Patrocinio patrocinio){
        this.listaPatrocinios.add(patrocinio);
    }
}
