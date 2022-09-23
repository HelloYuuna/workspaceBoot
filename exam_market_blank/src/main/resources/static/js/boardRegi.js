function boardRegiChk() {
    const title = $('#title').val();
    // console.log(title.length);

    if( title.length <= 5 ) {
        alert("제목을 입력하세요");
        return false;
    }

    const contents = $('#contents').val();
    if( contents.length <= 5 ) {
        alert("내용을 입력하세요");
        return false;
    }

    return true;
}