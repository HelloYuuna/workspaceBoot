function check() {
    let id = document.getElementById('memberid');
    // console.log(id.value);

    // 아이디 체크
    if (id.value.length === 0) {
        alert("아이디를 입력해주세요");
        id.focus();
        id.select();
        return false;
    }

    let memberpw = document.getElementById('memberpw');
    let pwChk = document.getElementById('pwChk');

    // 비밀번호 체크
    if (memberpw.value.length === 0 || pwChk.value.length === 0) {
        alert("비밀번호를 입력해주세요");

        if (pwChk.value.length === 0) {
            alert("비밀번호 확인란도 적어주세요");
            pwChk.focus();
            pwChk.select();
        }

        return false;

    } else if (memberpw.value !== pwChk.value) {
        alert("비밀번호가 일치하지 않습니다");
        memberpw.value = '';
        pwChk.value = '';
        memberpw.focus();
        memberpw.select();

        return false;
    }

    // 사용자 이름 체크
    let membername = document.getElementById('membername');
    if (membername.value.length === 0) {
        alert("이름을 입력해주세요");
        return false;
    }

    return true;
}