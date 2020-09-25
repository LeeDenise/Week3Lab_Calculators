package Servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 807785
 */
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String age = request.getParameter("age");
        
        if ( age == null || age.equals(""))
        {
            request.setAttribute("message", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);        
            return;
        } 
        else if (!(age.chars().allMatch(Character::isDigit)))
        {
            request.setAttribute("message", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);        
            return;
        } 
        
        request.setAttribute("message", "Your age next birthday will be " + age);

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);    
    }
}
