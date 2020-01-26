<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">

<jsp:include page="include/meta.jsp"/>

<body>

<jsp:include page="include/header.jsp"/>

<main class="container pb-3 mb-3">
    <div class="row text-center">
        <div class="container">
            <div class="col-md-4 m-auto">
                <form action="login" method="post">
                    <input type="hidden" name="currentURIFromLoginJSP" value="${currentURI}">
                    <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt=""
                         width="72" height="72">
                    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
                    <label for="inputlogin" class="sr-only">Login</label>
                    <input type="text" id="inputlogin" name="username" class="form-control" placeholder="Login"
                           required="" autofocus="">
                    <label for="inputPassword" class="sr-only">Password</label>
                    <input type="password" id="inputPassword" name="password" class="form-control"
                           placeholder="Password" required="">
                    <div class="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                    <p class="mt-5 mb-3 text-muted">© 2017-2018</p>
                </form>
            </div>
        </div>
    </div>
</main>
<jsp:include page="include/footer.jsp"/>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="js/bootstrap.js"></script>
</body>
</html>

