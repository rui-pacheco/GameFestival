/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefestival;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class ListaSessoes implements Serializable {
    ArrayList<Sessao> listaSessoes;

    public ListaSessoes(ArrayList<Sessao> listaSessoes) {
        this.listaSessoes = listaSessoes;
    }

    public ListaSessoes() {
        this.listaSessoes=new ArrayList<>();
    }

    public ArrayList<Sessao> getListaSessoes() {
        return listaSessoes;
    }

    public void setListaSessoes(ArrayList<Sessao> listaSessoes) {
        this.listaSessoes = listaSessoes;
    }
    
    public int getNumeroGameDesignersSessoes(){
        ArrayList<GameDesigner> gDs=new ArrayList<>();
        for (int i = 0; i < listaSessoes.size(); i++) {
            if (!gDs.contains(listaSessoes.get(i).getGameDesigner())) {
                gDs.add(listaSessoes.get(i).getGameDesigner());
            }
           
        }
        return gDs.size();
    }
    public float getCustoTotalSessoes(){
        ArrayList<GameDesigner> gDs=new ArrayList<>();
        float total=0;
        for (int i = 0; i < listaSessoes.size(); i++) {
            if (!gDs.contains(listaSessoes.get(i).getGameDesigner())) {
                gDs.add(listaSessoes.get(i).getGameDesigner());
            }}
            for (int j = 0; j < gDs.size(); j++) {
                total= gDs.get(j).getCusto() + total;
            }       
    return total;
}
    public float getCustoByData(String data){
        ArrayList<GameDesigner> gDs=new ArrayList<>();
        SimpleDateFormat dataS = new SimpleDateFormat("dd.MM.yy");
        float total=0;
        for (int i = 0; i < listaSessoes.size(); i++) {
            if (!(gDs.contains(listaSessoes.get(i).getGameDesigner()))&& dataS.format(listaSessoes.get(i).getData()).equals(data)) {
                gDs.add(listaSessoes.get(i).getGameDesigner());
            }}
        for (int j = 0; j < gDs.size(); j++) {
            total=gDs.get(j).getCusto()+total;
        }
        return total;
    }
}
