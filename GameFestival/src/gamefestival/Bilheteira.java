/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefestival;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rui
 */
public class Bilheteira implements Serializable{
    private int id;
    private float preco;
    private int bilhetes_vendidos;
    private ArrayList <Bilhete> bilhetes;
    private float lucro;
    private Date data;

    public Bilheteira(int id,float preco, ArrayList<Bilhete> bilhetes,Date data) {
        this.id=id;
        this.preco = preco;
        this.bilhetes = bilhetes;
        this.bilhetes_vendidos=0;
        this.lucro=0;
        this.data=data;
    }

    public Bilheteira(Date data) {
        this.preco=10;
        this.bilhetes=new ArrayList<>();
        this.bilhetes_vendidos=0;
        this.lucro=0;
        this.data=data;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getLucro() {
        return lucro;
    }

    public int getBilhetes_vendidos() {
        return bilhetes_vendidos;
    }
    

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ArrayList<Bilhete> getBilhetes() {
        return bilhetes;
    }

    public void setBilhetes(ArrayList<Bilhete> bilhetes) {
        this.bilhetes = bilhetes;
    }
    
    public void compra(int quantidade){
        this.bilhetes_vendidos = quantidade + bilhetes_vendidos;
        this.lucro= lucro + (quantidade * preco);
        for (int i = 0; i < quantidade; i++) {
            bilhetes.remove(0);
        }
        }
    
    
}
