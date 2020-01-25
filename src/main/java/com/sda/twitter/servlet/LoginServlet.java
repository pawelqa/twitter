package com.sda.twitter.servlet;

import com.sda.twitter.exception.ImproperLoginCredentials;
import com.sda.twitter.persistance.entities.TbUser;
import com.sda.twitter.service.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            TbUser tbUser = userService.getUserByUserName(username, password);
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", tbUser);
            response.sendRedirect("/");
        } catch (ImproperLoginCredentials improperLoginCredentials) {
            improperLoginCredentials.printStackTrace();
            response.sendRedirect("login.jsp");
        }

    }

}
