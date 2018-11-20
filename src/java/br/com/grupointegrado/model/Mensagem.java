/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.grupointegrado.model;

/**
 *
 * @author alunocentro
 */
public class Mensagem {
    
    private int idRemetente;
    private String Mensagem;

    public Mensagem() {
    }

    public Mensagem(int idRemetente, String Mensagem) {
        this.idRemetente = idRemetente;
        this.Mensagem = Mensagem;
    }

    public int getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(int idRemetente) {
        this.idRemetente = idRemetente;
    }

   
    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }
    
    
    
}
