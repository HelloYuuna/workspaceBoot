
//수정
function updatePersonBtn(name) {
    // alert(name);
    let msg = confirm("정말 수정하시겠습니까?");
    if(msg) {
        location.href = 'update?name=' + name;
    } else {
        alert("취소되었습니다.");
    }
}

//삭제
function deletePersonBtn(name) {
    // alert(name);
    let msg = confirm("정말 삭제하시겠습니까?");
    if(msg) {
        // alert(location.href);
        location.href = 'delete?name=' + name;
    } else {
        alert("취소되었습니다.");
    }
}