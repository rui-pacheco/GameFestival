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
public class GameDesigner implements Serializable {
    private final int id;
    private String nome;
    private int telefone;
    private int nif;
    private ArrayList<Jogo> jogos;
    private float custo;

    public GameDesigner(int id,String nome, int telefone, int nif, ArrayList<Jogo> jogos,float custo) {
        this.id=id;
        this.nome = nome;
        this.telefone = telefone;
        this.nif = nif;
        this.jogos = jogos;
        this.custo=custo;
    }

    public GameDesigner(int id, String nome, int telefone, int nif,float custo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.nif = nif;
        this.jogos=new ArrayList<>();
        this.custo=custo;
    }

    public int getId() {
        return id;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public ArrayList<Jogo>getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }
    
}
