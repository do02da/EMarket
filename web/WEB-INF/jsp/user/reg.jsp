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
    <link href="${pageContext.request.contextPath}/css/signin.css" rel="stylesheet">
</head>
<body class="d-flex flex-column h-100">
<%@ include file="/WEB-INF/jsp/header.jsp" %>

<main class="form-signin text-center">
    <form>
        회원가입
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

        <div class="form-floating">
            <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
            <label for="floatingInput">이메일주소</label>
        </div>

        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" placeholder="비밀번호">
            <label for="floatingPassword">비밀번호</label>
        </div>

        <div class="form-floating">
            <input type="password" class="form-control" id="PasswordCheck" placeholder="비밀번호 확인">
            <label for="PasswordCheck">비밀번호 확인</label>
        </div>

        <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
        <p class="mt-5 mb-3 text-muted">&copy; 2021</p>
    </form>
</main>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>

</body>
</html>