/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefestival;

/**
 *
 * @author Rui
 */
public class Sistema{
    private Festival festival;
    private Utilizador utilizador;

    public Sistema(Festival festival, Utilizador utilizador) {
        this.festival = festival;
        this.utilizador = utilizador;
    }

    public Sistema(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
    
    public boolean login (String nome,String password){
        return nome.equals(utilizador.getNome()) && password.equals(utilizador.getPassword());
    }
    
}
