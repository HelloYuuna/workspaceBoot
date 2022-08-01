// Posting

function postingChk() {
    // 제목 체크
    let title = document.getElementById('title');
    if ( title.value.length === 0 ) {
        alert("제목을 입력해주세요");
        title.focus();
        return false;
    }

    return true;
}

function pagingFormSubmit(pageNum) {
    // alert(pageNum);
    let form = document.getElementById('pagingForm');
    let page = document.getElementById('page');
    page.value = pageNum;
    form.submit();
}