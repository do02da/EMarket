$(function () {
    $("#input_email").blur(function () {
        email_validation($(this).val());
    })
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