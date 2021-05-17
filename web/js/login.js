$(document).ready(function() {
    $("#input_email").blur(function (e) {
        e.preventDefault();
        email_validation($(this).val());
    });

    $("#submit_btn").on("click", function (e) {
        e.preventDefault();
        fn_submit();
    });
});

function email_validation(email) {
    const emailReg = /^([0-9a-zA-Z.-]+)@([0-9a-zA-Z-]+)(.[0-9a-zA-Z_-]+){1,2}$/;    // 이메일 정규표현식

    if (gfn_isNull(email)) {
        // 항목이 비어있을 때

    } else if (!emailReg.test(email)) {
        // 양식에 맞지 않을 때

    } else {
        // 유효성 검사 통과

    }
}

function fn_submit() {
    let comSubmit = new ComSubmit("login-form");
    comSubmit.setUrl("/user/login.do");
    comSubmit.submit();
}