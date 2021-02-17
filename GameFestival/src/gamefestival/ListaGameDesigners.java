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
public class ListaGameDesigners implements Serializable {
    ArrayList <GameDesigner> listaGameDesigners;

    public ListaGameDesigners() {
        this.listaGameDesigners = new ArrayList<>();
    }

    public ListaGameDesigners(ArrayList<GameDesigner> listaGameDesigners) {
        this.listaGameDesigners = listaGameDesigners;
    }

    public ArrayList<GameDesigner> getListaGameDesigners() {
        return listaGameDesigners;
    }

    public void setListaGameDesigners(ArrayList<GameDesigner> listaGameDesigners) {
        this.listaGameDesigners = listaGameDesigners;
    }
    
    public float getCustoGameDesigners(){
        float custo=0;
        for (GameDesigner gameDesigner : listaGameDesigners) {
            custo=custo+gameDesigner.getCusto();
        }
        return custo;}
    
    public void add(GameDesigner gameDesigner){
        this.listaGameDesigners.add(gameDesigner);
    }
    
    public ArrayList<Jogo> getTodosOsJogos(){
        ArrayList jogos = new ArrayList<>();
        for (int i = 0; i < listaGameDesigners.size(); i++) {
            for (int j = 0; j < listaGameDesigners.get(i).getJogos().size(); j++) {
                jogos.add(listaGameDesigners.get(i).getJogos().get(j));
            }
        }
        return jogos;
    }

    
    
}
