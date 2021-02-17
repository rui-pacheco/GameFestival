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
public class ListaColaboradores implements Serializable {
    ArrayList <Colaborador> colaboradores;

    public ListaColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public ListaColaboradores() {
        this.colaboradores = new ArrayList<>();
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }
    
        public ArrayList<Colaborador> getPagos(){
        ArrayList<Colaborador> pagos=new ArrayList<>();
        for(Colaborador colaborador : colaboradores){
            if(colaborador instanceof Pagos){
                pagos.add(colaborador);
            }
        }
        return pagos;
    } 
    
    public ArrayList<Colaborador> getVoluntarios(){
        ArrayList<Colaborador> voluntarios=new ArrayList<>();
        for(Colaborador colaborador : colaboradores){
            if(colaborador instanceof Voluntario){
                voluntarios.add(colaborador);
            }
        }
        return voluntarios;
    }
    
    public void add (Colaborador colaborador){
        this.colaboradores.add(colaborador);
    }
    
    public float getCusto(){
        float total=0;
        for (Colaborador colaborador : colaboradores) {
            if(colaborador instanceof Pagos){
                total=((Pagos) colaborador).getSalario()+total;
            }
        }
        return total;
    }
}
