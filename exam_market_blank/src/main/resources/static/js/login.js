function check() {
    let id = $('#memberid').val();
    let pwd = $('#memberpw').val();
    let name = $('#membername').val();
    let phone = $('#phone').val();

    if ( id.length < 3 ) {
        alert('ID는 3~10자로 입력하세요');
        return false;
    }

    if ( pwd.length < 3 ) {
        alert('비밀번호는 3~10자로 입력하세요');
        return false;
    }

    if ( name === '' ) {
        alert('이름을 입력하세요');
        return false;
    }

    if ( phone === '' ) {
        alert('전화번호를 입력하세요');
        return false;
    }

    return true;
}