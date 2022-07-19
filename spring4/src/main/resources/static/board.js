// 게시글 작성 이동
function gotoWrite() {
    // console.log(location.href);
    location.href='boardInsert';
}

// 게시글 삭제
// 여기저기 흩어진 데이터를 하나의 hiddenForm에 담아 보내는 방법
function gotoDelete(num) {
    console.log(num);                                           // 글 번호
    let inputPwd = document.getElementById('pw'+num);
    let form = document.getElementById('deleteForm');   //hidden
    let password = document.getElementById('password'); //hidden
    let number = document.getElementById('num');        //hidden

    if(confirm('삭제 하시겠습니까?')) {
        number.value = num;                                  // 넘어온 글번호 저장
        password.value = inputPwd.value;                    // 넘어온 입력한 비밀번호 넘길 비밀번호 저장
        form.submit();
    }

}

// function gotoDelete(password, num) {
    // console.log(password);                                // 원래 비밀번호
    // console.log(num);                                     // 글 번호

    // let input_pwd = document.getElementById("password");
    // // console.log(password);                           // 입력받은 비밀번호
    // if (input_pwd.value.length === 0) {
    //     alert("비밀번호를 입력해주세요");
    //     return;
    // }
    //
    // // 비밀번호 일치 여부
    // if (password !== input_pwd.value) {
    //     alert("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
    //     input_pwd.select();
    //     input_pwd.value = '';
    //     return;
    // }
    //
    // let msg = confirm("정말 삭제하시겠습니까?");
    // if (msg) {
    //     // delete? 뒤에 나오는 password 는 컨트롤러에서 받는 파라메터 값
    //     location.href='delete?password=' + password + "&num=" + num;
    // } else {
    //     alert("취소되었습니다.");
    // }
// }

