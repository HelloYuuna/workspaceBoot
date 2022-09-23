$(document).ready(function () {
    // $('#btn').click(idChk);
    $('#memberid').keyup(idLengthChk);
});

function nameChk() {
    let name = $('#memberid').val();
    let nameRegExp = /^[가-힣a-zA-Z]+$/;

    if ( name == '' ) {
        alert('이름을 입력해주세요');
        return false;

    } else if( name.length < 3 ) {
        alert('이름은 3글자 이상 입력해주세요');
        return false;

    } else if ( !nameRegExp.test(name) ) {
        alert('이름은 한글과 영문만 가능합니다.');
        return false;
    }

    return true;
}

function idChk() {
    // alert('테스트');

    let id = $('#memberid').val();
    $.ajax({
        url:'idChk',
        type:'post',
        data: { id:id },
        success: function(isIdChk) {
            // console.log(isIdChk);
            const used = '해당 아이디는 사용중입니다.';
            const unused = '사용할수 있는 아이디입니다.';

            // 불리언 타입
            if ( !isIdChk ) {
                $('#idLenghtChk').html(used);

            } else {
                $('#idLenghtChk').css('color', '#94d2bd').html(unused);
                $('#submit').attr('disabled', false);
            }

            // submit버튼에 css지정용 class부여
            $('#submit').addClass('addEventBtn');

        },
        error: function (e) {
            alert('중복확인 실패');
            JSON.stringify(e);
        }
    });

}
function idLengthChk() {

    let id = $('#memberid').val();
    console.log('멤버아이디 값: ', id);

    // id 유효성 체크 정규식: 영문만 가능
    let idRegExp = /^[A-za-z]/g;

    // 아이디의 길이가 3글자 미만
    if( id.length < 3 ) {
        $('#idLenghtChk').html('아이디는 3자리 이상 입력해주세요');
        return;
    }

    // 정규식 사용 test() 함수를 이용하여 정규식 표현을 이용하여 treu false 를 반환
    if ( !idRegExp.test(id) ) {
        $('#idLenghtChk').html('아이디는 영어만 가능합니다.');
        return;

    } else {
        $('#idLenghtChk').html('');
    }

    // 버튼 활성화 : disabled false
    $('#btn').attr('disabled', false);

    // css 부여
    $('#btn').addClass('addEventBtn');

    // 버큰 클릭이베트 활성화
    $('#btn').click(idChk);
}