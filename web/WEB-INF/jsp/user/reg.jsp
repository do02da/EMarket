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

<main class="form-signup">
    <form id="reg-form">
        <h1 class="h3 mb-3 fw-normal text-center">Sign up</h1>
        <div class="form-floating">
            <input type="email" class="form-control" id="email" name="email">
            <label for="email">이메일 주소</label>
            <text id="email-validation-text">이메일을 입력해주세요</text>

        </div>

        <div class="form-floating">
            <input type="password" class="form-control" id="password" name="password">
            <label for="password">패스워드</label>
            <text id="password-validation-text">8 ~ 15자, 최소 하나의 문자와 숫자 포함</text>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="password-check" name="password-check">
            <label for="password-check">패스워드 확인</label>
            <text id="password-check-validation-text">비밀번호와 일치해야 합니다</text>
        </div>

        <div class="form-floating">
            <input type="text" class="form-control" id="nickname" name="nickname">
            <label for="nickname">닉네임</label>
        </div>
        <div class="form-floating">
            <input type="text" class="form-control" id="tel" name="tel">
            <label for="tel">전화번호</label>
        </div>

        <div class="post-input">
            <input type="button" class="d_btn" onclick="daumPostcode()" value="우편번호 찾기" readonly>
            <input type="text" class="form-control" id="postcode" name="postcode" placeholder="우편번호" readonly>
            <input type="text" class="form-control" id="address" name="address" placeholder="주소" readonly>
            <input type="text" class="form-control" id="detailAddress" name="detail-address" placeholder="상세주소">
        </div>

        <button class="w-100 btn btn-lg btn-primary" type="submit" id="submit_btn">Sign up</button>



        <p class="mt-5 mb-3 text-muted">&copy; 2021</p>
    </form>
</main>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>

<script src="<c:url value='/js/reg.js'/>" charset="UTF-8"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</body>
</html>
