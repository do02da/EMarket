$(function () {

    $("#email").on("blur", function (){
        emailValidation($(this).val());
    });

    $("#password").on("propertychange change keyup paste input blur", function (){
        passwordValidation($(this).val());
    });

    $("#password-check").on("propertychange change keyup paste input blur", function (){
        checkPasswordMatching($(this).val());
    });
});

function emailValidation(email) {
    const emailReg = /^([0-9a-zA-Z.-]+)@([0-9a-zA-Z-]+)(.[0-9a-zA-Z_-]+){1,2}$/;    // 이메일 정규표현식
    const validationText = $("#email-validation-text");
    let msg = "";
    let color = "";
    if (gfn_isNull(email)) {    // 이메일이 비어있을 때
        msg = "이메일을 입력해주세요";
        color = "#CCCC00";
    } else if (!emailReg.test(email)) {    // 이메일 양식에 맞지 않으면
        msg = "이메일을 확인해주세요";
        color = "RED";
    } else {
        // 중복 체크 기능 추가해야함.
        msg = "사용가능";
        color = "BLUE";
    }

    validationText.css("color", color);
    validationText.text(msg);
} // emailValidation

function passwordValidation(password){
    const passwordCheck = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,15}$/; // 비밀번호 8~15자, 최소 하나의 숫자와 하나의 문자
    const pwValText = $("#password-validation-text");
    let msg = "";
    let color = "";
    if(!passwordCheck.test(password)){ // 양식 맞지 않으면
        msg = "8 ~ 15자, 최소 하나의 문자와 숫자 포함";
        color = "RED";
    }else{
        msg = "사용 가능";
        color = "BLUE";
    }
    pwValText.css("color", color);
    pwValText.text(msg);
} // passwordValidation

function checkPasswordMatching(pwCheck){
    const pwCheckValText = $("#password-check-validation-text");
    let msg = "";
    let color = "";
    if(gfn_isNull(pwCheck)){
        msg = "비밀번호와 일치해야 합니다";
    }else if($("#password").val() === pwCheck){
        msg = "일치";
        color = "BLUE";
    }else{
        msg = "일치하지 않습니다";
        color = "RED";
    }
    pwCheckValText.css("color", color);
    pwCheckValText.text(msg);
} // checkPasswordMatching

function daumPostcode(){
    new daum.Postcode({
        oncomplete: function(data) {
// 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            let addr = ''; // 주소 변수
            let extraAddr = ''; // 참고항목 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
            if(data.userSelectedType === 'R'){
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraAddr !== ''){
                    extraAddr = ' (' + extraAddr + ')';
                }
                // 조합된 참고항목을 해당 필드에 넣는다.
                // document.getElementById("extraAddress").value = extraAddr;

            } else {
                $("#extraAddress").val = '';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById("postcode").value = data.zonecode;
            document.getElementById("address").value = addr + extraAddr;
            // 커서를 상세주소 필드로 이동한다.
            $("#detailAddress").focus();
        }
    }).open();
} // daumPostcode