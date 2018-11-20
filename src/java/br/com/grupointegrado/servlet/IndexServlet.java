/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.grupointegrado.servlet;

import br.com.grupointegrado.model.Conversa;
import br.com.grupointegrado.model.Mensagem;
import br.com.grupointegrado.util.RandomNumGen;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alunocentro
 */
public class IndexServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        RequestDispatcher JotaQuest = req.getRequestDispatcher("/WEB-INF/paginas/index.jsp");

        JotaQuest.forward(req, resp);
       
        
    
         
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Conversa chat = new Conversa(); 
 
        if(req.getParameter("id")!= null){
            
        chat.setID(Integer.parseInt(req.getParameter("id")));
        }
        
        if (!req.getSession().isNew()){
         chat.setID(RandomNumGen.getRandomNumberInRange(1,300));
         req.getSession().setAttribute("id", chat.getID());
            doGet(req, resp);
        } 
       
        try {
            
        Mensagem obj = new Mensagem();
        obj.setMensagem((String)req.getParameter("mensagem"));
       
       int validador = (int) req.getSession().getAttribute("id");
       
       if(validador == (int) req.getSession().getAttribute("id")){
           req.setAttribute("MyMSG", obj.getMensagem());
       }else{
           req.setAttribute("MSG", obj.getMensagem());
       }
        } catch (NullPointerException e) {
        e.printStackTrace();
        }
       
       
    }
    
    
}
