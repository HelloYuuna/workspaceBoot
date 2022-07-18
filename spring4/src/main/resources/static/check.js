function check() {
    let name = document.getElementById("name");
    if (name.value.length === 0) {
        alert("이름을 입력해주세요");
        name.select();
        return false;
    }

    if (name.value.length < 2) {
        alert("이름은 두 글자 이상 입력해주세요");
        name.select();
        name.value = "";
        return false;
    }

    let pwd = document.getElementById("password");
    if (pwd.value.length === 0) {
        alert("비밀번호를 입력해주세요");
        pwd.select();
        return false;
    }

    return true;
}