
//수정
function updateBtn() {
    alert("소환!");
}

//삭제
function deleteBtn() {
    let msg = confirm("정말 삭제하시겠습니까?");
    if(msg) {
        //true
        // alert("확인");
        location.href="delete";
    } else {
        //false
        alert("취소");
    }
}