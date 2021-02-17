/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefestival;

import java.io.Serializable;

/**
 *
 * @author Rui
 */
public class Voluntario extends Colaborador implements Serializable {

    public Voluntario(int id,String nome, String morada, int telefone, String cargo) {
        super(id,nome, morada, telefone, cargo);
    }

    
}
