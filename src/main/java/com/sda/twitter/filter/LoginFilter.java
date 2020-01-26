package com.sda.twitter.filter;

import com.sda.twitter.persistance.entities.TbUser;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/add-article.jsp")
public class LoginFilter implements Filter {

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();
        TbUser currentUser = (TbUser) session.getAttribute("currentUser");

        if (currentUser == null) {
            final String requestURI = httpServletRequest.getRequestURI();
            httpServletRequest.setAttribute("currentURI", requestURI);
            RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(servletRequest, servletResponse);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}