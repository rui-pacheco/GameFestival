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
public class Pagos extends Colaborador implements Serializable {
    private int nif;
    private float salario;

    public Pagos(int id,int nif, float salario, String nome, String morada, int telefone, String cargo) {
        super(id,nome, morada, telefone, cargo);
        this.nif = nif;
        this.salario = salario;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
