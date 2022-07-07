
function check() {
    let usrname = document.getElementById("usrname");
    if(usrname.value.length === 0 || !isNaN(usrname.value)) {
        alert("이름을 입력해주세요");
        return false;
    }

    let myId = document.getElementById("myId");
    if(myId.value.length !== 14) {
        alert("주민등록번호를 제대로 입력해주세요");
        return false;
    }

    if (myId.value.includes("-")) {
        alert("-를 포함하여 입력해주세요.");
        return false;
    }

    return true;
}