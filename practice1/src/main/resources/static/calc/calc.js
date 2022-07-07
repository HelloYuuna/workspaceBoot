
/* check */
function check() {
    // alert("확인용");
    let rightNum = document.getElementById("rightNum");
    if(rightNum.value === '' || isNaN(rightNum.value)) {
        alert("정수를 입력하세요");
        return false;
    }

    let leftNum = document.getElementById("leftNum");
    if(leftNum.value === '' || isNaN(leftNum.value)) {
        alert("정수를 입력하세요");
        return false;
    }

    return true;                        // true 리턴해서 action 설정한 페이지로 이동
}