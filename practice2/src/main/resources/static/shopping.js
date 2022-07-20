
// 상세보기로 이동
function gotoDetail(pnum) {
    console.log(pnum);
    location.href = 'detail?pnum=' + pnum;
}

// 장바구니로 이동
function gotoCart(pnum) {
    // console.log(pnum);

    // if(confirm("물건을 담으시겠습니까?")) {
    //     // let pNum = document.getElementById('num');
    //     // pNum.value = pnum;          //히든 타입에 제품번호 저장
    //
    //     // let gotoCartForm = document.getElementById('gotoCartForm');
    //     // gotoCartForm.submit();
    //
    // }
    return confirm("물건을 담으시겠습니까?");
}