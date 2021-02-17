/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefestival;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rui
 */
public class Festival implements Serializable {
    private String nome;
    private Date data;
    private String local;
    private int duracao;
    private int maximo_participantes;
    private ListaColaboradores colaboradores;
    private ListaGameDesigners designers;
    private ListaPatrocinios patrocinios;
    private ListaSessoes sessoes;
    private ListaBilheteiras bilheteiras;

    public Festival(String nome, Date data, String local, int duracao, int maximo_lugares, ListaColaboradores colaboradores, ListaGameDesigners designers, ListaPatrocinios patrocinios, ListaBilheteiras bilheteira, ListaSessoes sessoes) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.duracao = duracao;
        this.maximo_participantes = maximo_lugares;
        this.colaboradores = colaboradores;
        this.designers = designers;
        this.patrocinios = patrocinios;
        this.bilheteiras = bilheteira;
        this.sessoes = sessoes;
    }
        public Festival(String nome, Date data, String local, int duracao,int maximo_participantes) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.duracao = duracao;
        this.maximo_participantes = maximo_participantes;
        this.colaboradores = new ListaColaboradores();
        this.designers = new ListaGameDesigners();
        this.patrocinios = new ListaPatrocinios();
        this.bilheteiras = new ListaBilheteiras();
        this.sessoes = new ListaSessoes();
    }

    public ListaSessoes getSessoes() {
        return sessoes;
    }

    public void setSessoes(ListaSessoes sessoes) {
        this.sessoes = sessoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getMaximo_participantes() {
        return maximo_participantes;
    }

    public void setMaximo_participantes(int maximo_participantes) {
        this.maximo_participantes = maximo_participantes;
    }

    public ListaColaboradores getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ListaColaboradores colaboradores) {
        this.colaboradores = colaboradores;
    }

    public ListaGameDesigners getDesigners() {
        return designers;
    }

    public void setDesigners(ListaGameDesigners designers) {
        this.designers = designers;
    }

    public ListaPatrocinios getPatrocinios() {
        return patrocinios;
    }

    public void setPatrocinios(ListaPatrocinios patrocinios) {
        this.patrocinios = patrocinios;
    }

    public ListaBilheteiras getBilheteiras() {
        return bilheteiras;
    }

    public void setListaBilheteiras(ListaBilheteiras bilheteiras) {
        this.bilheteiras = bilheteiras;
    }
    
    public int getNJogos(){
        int n = 0;
        for (int i = 0; i < designers.getListaGameDesigners().size(); i++) {
            for (int j = 0; j < designers.getListaGameDesigners().get(i).getJogos().size(); j++) {
                n++;
            }
        }
        return n;
    }

}
