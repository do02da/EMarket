$(function () {

    $("#email").on("blur", function (){
        email_validation($(this).val());
    });

    // $("#floatingInput").on("propertychange change keyup paste input", function (){
    //    let id = $("#floatingInput").val();
    //    $("#text").text(id);
    // });

});

function email_validation(email) {
    const emailReg = /^([0-9a-zA-Z.-]+)@([0-9a-zA-Z-]+)(.[0-9a-zA-Z_-]+){1,2}$/;    // 이메일 정규표현식
    const validationText = $("#validation-text");
    let id = "";

    if (gfn_isNull(email)) {    // 이메일이 비어있을 때
        id = "이메일을 입력해주세요";
        validationText.css("color", "CCCC00");
    } else if (!emailReg.test(email)) {    // 이메일 양식에 맞지 않으면
        id = "이메일을 확인해주세요";
        validationText.css("color", "RED");
    } else {
        id = "사용가능";
        validationText.css("color", "BLUE");
    }

    validationText.text(id);
}