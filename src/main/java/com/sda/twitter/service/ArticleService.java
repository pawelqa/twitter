package com.sda.twitter.service;

import com.sda.twitter.persistance.dao.ArticleDao;
import com.sda.twitter.persistance.entities.TbUser;

import java.util.List;

public class ArticleService {
    private ArticleDao articleDao = new ArticleDao();

    public List getArticles() {
        return articleDao.getArticles();
    }

    public void addArticle(TbUser tbUser, String content) {
        articleDao.addArticle(tbUser, content);
    }


}
