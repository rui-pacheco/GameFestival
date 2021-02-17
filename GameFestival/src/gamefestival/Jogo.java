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
public class Jogo implements Serializable {
    private int id;
    private String nome;
    private String editora;

    public Jogo(int id,String nome, String editora) {
        this.id=id;
        this.nome = nome;
        this.editora = editora;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
