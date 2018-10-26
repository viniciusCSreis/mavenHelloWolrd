package com.mycompany.javaMagazineWeb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.app.services.MegasenaResult;

public class ResultadoMegasenaServlet extends HttpServlet {

    private static final long serialVersionUID = -2387491444867572667L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String[] resultado = MegasenaResult.obtemUltimoResultado();
        for (String dezena: resultado) {
            out.print(dezena + " ");
        }

        out.flush();
        out.close();
    }
}
