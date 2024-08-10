package com.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpContext;
import java.io.IOException;

/**
 * @Author: Func0
 * @Date: 2024/8/4 17:34
 */
@WebServlet("/*.do")
public class demo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String aaa = req.getParameter("aaa");
        resp.getWriter().write(aaa);
    }
}
