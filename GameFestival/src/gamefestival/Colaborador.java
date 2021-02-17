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
public abstract class Colaborador implements Serializable {
    private int id;
    private String nome;
    private String morada;
    private int telefone;
    private String cargo;

    public Colaborador(int id,String nome, String morada, int telefone, String cargo) {
        this.id=id;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
