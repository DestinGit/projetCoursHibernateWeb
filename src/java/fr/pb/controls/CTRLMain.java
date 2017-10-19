/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import cours.hibernate.entities.Villes;
import cours.hibernate.util.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author formation
 */
@WebServlet(name = "CTRLMain", urlPatterns = {"/CTRLMain"})
public class CTRLMain extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Session session;
        List<Villes> listeResultat = null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query q = session.createQuery("FROM Villes");
            listeResultat = q.list();          
            
            request.setAttribute("results", listeResultat);
        }catch(HibernateException he) {
            System.out.println("error : " + he.getMessage());
        }
        
        String lsURL = "Accueil.jsp";
        getServletContext().getRequestDispatcher("/jsp/" + lsURL).forward(request, response);
    }

}
