/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefestival;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rui
 */
public class Sessao implements Serializable {
    private int id;
    private Jogo jogo;
    private Date data;
    private Date hora;
    private GameDesigner gameDesigner;

    public Sessao(int id,Jogo jogo, Date data, Date hora, GameDesigner gameDesigner) {
        this.id=id;
        this.jogo = jogo;
        this.data = data;
        this.hora = hora;
        this.gameDesigner = gameDesigner;
    }

    public int getId() {
        return id;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public GameDesigner getGameDesigner() {
        return gameDesigner;
    }

    public void setGameDesigner(GameDesigner gameDesigner) {
        this.gameDesigner = gameDesigner;
    }
}