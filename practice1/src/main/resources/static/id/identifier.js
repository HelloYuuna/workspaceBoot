
function check() {
    let usrname = document.getElementById("usrname");
    if(usrname.value.length === 0 || !isNaN(usrname.value)) {
        alert("이름을 입력해주세요");
        return false;
    }

    let myId = document.getElementById("myId");
    if(myId.value.length === 0) {
        alert("주민등록번호를 입력해주세요");
        return false;
    }

    return true;
}