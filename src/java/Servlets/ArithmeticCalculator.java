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
public class ArithmeticCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        request.setAttribute("message", "---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        int intFirstNum;
        int intSecondNum;
        int result = 0;
        String calButton;

        request.setAttribute("firstNum", firstNum);
        request.setAttribute("secondNum", secondNum);

        // input validation: null, empty string, not digit
        if ( firstNum == null || firstNum.equals("") || 
                secondNum == null || secondNum.equals("") ||
                !(firstNum.chars().allMatch(Character::isDigit)) || !(secondNum.chars().allMatch(Character::isDigit)))
        {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);        
            return;
        }
        
        // parsing the parameter into int
        intFirstNum = Integer.parseInt(firstNum);
        intSecondNum = Integer.parseInt(secondNum);

        // calculate the input numbers
        calButton = request.getParameter("calButton");
        
        if (calButton.equals("+"))
        {
            result = intFirstNum + intSecondNum;
        } else if (calButton.equals("-"))
        {
            result = intFirstNum - intSecondNum;
        } else if (calButton.equals("*"))
        {
            result = intFirstNum * intSecondNum;
        }else if (calButton.equals("%"))
        {
            result = intFirstNum % intSecondNum;
        }
        
        request.setAttribute("message", result);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);    
    }
}
