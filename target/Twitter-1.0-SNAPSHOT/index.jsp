<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.sda.twitter.service.ArticleService"%>
<%@ page import="com.sda.twitter.persistance.entities.TbArticle"%>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="articleService" scope="request" class="com.sda.twitter.service.ArticleService"/>

<!doctype html>
<html lang="en">

<jsp:include page="include/meta.jsp"/>

<body>

<jsp:include page="include/header.jsp"/>

<main role="main">
    <%
        final List<TbArticle> articles = articleService.getArticles();
        pageContext.setAttribute("articles", articles);
    %>
    <div class="container">
        <c:forEach items="${articles}" var="article">
            <div class="row d-flex justify-content-center">
                <div class="col-5">
                    <h2>Heading</h2>
                    <p>${article.content}</p>
                    <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
                </div>
            </div>
            <hr>
        </c:forEach>

    </div><!-- /container -->
</main>
<jsp:include page="include/footer.jsp"/>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="js/bootstrap.js"></script>
</body>
</html>

