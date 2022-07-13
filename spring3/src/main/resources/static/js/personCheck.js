function check() {
    let name = document.getElementById("name");
    if(name.value.length < 2) {
        alert("이름을 입력해주세요");
        return false;
    }

    let age = document.getElementById("age");
    if (age.value.length === 0) {
        alert("나이를 입력해주세요");
        return false;
    }

    if (isNaN(age.value)) {
        alert("숫자를 입력해주세요");
        return false;
    }

    return true;
}