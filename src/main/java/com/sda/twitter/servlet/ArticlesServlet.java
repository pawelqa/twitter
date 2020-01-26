package com.sda.twitter.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sda.twitter.service.ArticleService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

@WebServlet(urlPatterns = "/api/articles")
public class ArticlesServlet extends HttpServlet {
    private ArticleService articleService = new ArticleService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String pathInfo = req.getPathInfo();
        if (pathInfo == null || pathInfo.equals("/")) {
            final List articles = articleService.getArticles();
            sendAsJson(articles, resp);
        }
    }

    private void sendAsJson(List models, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        final Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        final String jsonString = gson.toJson(models);
        final PrintWriter writer = response.getWriter();
        writer.print(jsonString);
        writer.flush();
    }
}
