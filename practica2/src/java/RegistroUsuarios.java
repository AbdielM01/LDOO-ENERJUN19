/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abdie
 */
@WebServlet(urlPatterns = {"/RegistroUsuarios"})
public class RegistroUsuarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html><head>");
        out.println("<title>PRACTICA 2 DE LDOO</title>");
        out.println("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
        out.println("<p class='email'>Tu correo es: " + request.getParameter("email")+ "</p>");
        out.println("<p class='password'>Tu contraseña es: " + request.getParameter("password")+"</p>");
        out.println("<p class='name'>Tu nombre es: " + request.getParameter("name")+"</p>");
        out.println("<p class='date'>Tu fecha de nacimiento es: " + request.getParameter("date")+"</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");  
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
