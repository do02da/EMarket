$(document).ready(function() {
    $("#login_btn").on("click", function(e) {
        e.preventDefault();
        fn_login_open();
    });

    $("#reg_btn").on("click", function (e) {
        e.preventDefault();
        fn_reg_open();
    });
});

function fn_login_open() {
    let comSubmit = new ComSubmit();
    comSubmit.addParam("go", "/user/login");
    comSubmit.setUrl("/pageMove.do");
    comSubmit.submit();
}

function fn_reg_open() {
    let comSubmit = new ComSubmit();
    comSubmit.addParam("go", "/user/reg");
    comSubmit.setUrl("/pageMove.do");
    comSubmit.submit();
}