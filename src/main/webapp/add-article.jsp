<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">

<jsp:include page="include/meta.jsp"/>

<body>

<jsp:include page="include/header.jsp"/>

<main role="main">
    <div class="container">
        <div class="row text-center">
            <div class="col-md-8 m-auto text-left">
                <h4 class="mb-3">Add new Article</h4>
                <form name="addArticleForm" class="needs-validation" action="addArticle" method="post">
                    <div class="mb-3">
                        <div class="form-group">
                            <label>Content
                                <textarea class="form-control" name="content" rows="8" cols="125"></textarea>
                            </label>
                        </div>
                    </div>
                    <hr class="mb-4"/>
                    <button class="btn btn-primary btn-lg " type="submit">Add article</button>
                </form>
            </div>
        </div>
    </div><!-- /container -->
</main>

<jsp:include page="include/footer.jsp"/>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="js/bootstrap.js"></script>
</body>
</html>
