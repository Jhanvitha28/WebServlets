package com.java.cis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/example")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printOut = response.getWriter();
        printOut.write("<html><body><h1>Hello, This is the first "+
                "servlet</h1>"+
                "<input> User Name</input>"+
                "<input type =\"password\">password</input>"+
                "<?form><?body></html>");
    }

}
