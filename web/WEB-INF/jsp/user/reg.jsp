<%--
  Created by IntelliJ IDEA.
  User: Do0
  Date: 2021-04-13
  Time: 오후 3:51
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html class="h-100">
<head>
    <title>Title</title>
    <%@ include file="/WEB-INF/include/include-header.jspf" %>
    <link href="${pageContext.request.contextPath}/css/reg.css" rel="stylesheet">
</head>

<body class="d-flex flex-column h-100">
    <%@ include file="/WEB-INF/jsp/header.jsp" %>

    <main class="form-signup text-center">
        <form>
            <h1 class="h3 mb-3 fw-normal">Sign up</h1>
            <div class="form-floating">
                <input type="email" class="form-control" id="email" placeholder="name@example.com">
                <label for="email">Email address</label>
                <text id="validation-text"></text>

            </div>

            <div class="form-floating">
                <input type="password" class="form-control" id="password" placeholder="Password">
                <label for="password">Password</label>
            </div>
            <div class="form-floating">
                <input type="password" class="form-control" id="password-check" placeholder="name@example.com">
                <label for="password-check">Password Check</label>
            </div>
            <button class="w-100 btn btn-lg btn-primary" type="submit">Sign up</button>



            <p class="mt-5 mb-3 text-muted">&copy; 2021</p>
        </form>
    </main>

    <%@ include file="/WEB-INF/jsp/footer.jsp" %>

    <script src="<c:url value='/js/reg.js'/>" charset="UTF-8"></script>
</body>
</html>
