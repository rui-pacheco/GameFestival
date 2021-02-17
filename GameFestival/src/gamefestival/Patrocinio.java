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
public class Patrocinio implements Serializable {
    private final int id;
    private String nome;
    private float contribuicao;

    public Patrocinio(int id,String nome, float contribuicao) {
        this.id=id;
        this.nome = nome;
        this.contribuicao = contribuicao;
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

    public float getContribuicao() {
        return contribuicao;
    }

    public void setContribuicao(float contribuicao) {
        this.contribuicao = contribuicao;
    }
}
