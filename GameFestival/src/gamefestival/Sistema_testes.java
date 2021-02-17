/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamefestival;

import bd.BaseDados;
import gui.JanelaPrincipal;
import java.util.Date;

/**
 *
 * @author Rui
 */
public class Sistema_testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*UTILIZADORES*/
        Utilizador utilizador = new Utilizador("admin",911111111,"admin");
        
        Date data = new Date();
        /*Bilhetes*/
       // String data="15-05-2017";
        

        /*--------------*/
        /*Bilheteira*/

        /*-------------*/
        /*Jogo*/

       /*--------------*/
       /*Game Designer*/
      // GameDesigner dylan = new GameDesigner(1,"Dylan Brito",922456874,255412354,jogos,20);

       //gameDesigners.add(dylan);
       /*-------------*/
       /*Sessao*/
       //Sessao sessao = new Sessao(uncharted,data,"14:00",dylan);
 
       /*-------------/
       /*Colaboradores*/

       /*-------------*/
       /*Patrocinio*/

       
       /*----------*/
       /*Festival*/
       /*Festival gameFestival;
       gameFestival = new Festival("Game Festival",data,"Guimarães",0,0);*/
       /*---------*/
       /*Base de Dados*/
       
        BaseDados baseDados = new BaseDados("GameFestival");
        
        
        /*Sistema sistema = new Sistema(gameFestival,utilizador);*/
        
        
       /*JanelaLogin janelaLogin = new JanelaLogin(sistema,baseDados);
       janelaLogin.setVisible(true);*/
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal(baseDados);
        janelaPrincipal.setVisible((true));
        
    }
    
}
