// gotoJoin
function gotoJoin(id) {
    // alert(id);

    if (!isNaN(id)) {
        let searchid = document.getElementById('serchId');
        alert("아이디는 숫자가아닌 문자로 입력해주세요");
        searchid.focus();
        searchid.value = '';

        return;
    }

    opener.document.getElementById('memberid').value = id;
    this.close();
}

//idChkForm-open
function idFormOpen() {
    //GET방식
    let size = 'left=50,top=50,width=100,heigth=100';
    let win =window.open('idChk','win',size);
    /*win.window.resizeTo(500, 200);
    win.window.moveTo(50,50);*/
}


function check() {
    // 아이디 체크
    // let id = document.getElementById('memberid');
    // console.log(id.value);

    // if (id.value.length === 0) {
    //     alert("아이디를 입력해주세요");
    //     id.focus();
    //     // id.select();
    //     return false;
    // }

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