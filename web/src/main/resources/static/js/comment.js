
    /* JQuery */
    $(document).ready(function() {
    $('#btn').click(insert);
    getCmnt();
});

    function insert() {
    let name = $('#name').val();
    let cmnt = $('#cmnt').val();

    if(name == '' || cmnt == '') {
    alert('이름과 댓글을 입력하세요');
    return;
}

    $.ajax({
    url:'insert',
    type:'post',
    data: {name:name, text:cmnt},
    success: function () {
    alert('저장 성공!');
    getCmnt();
} ,
    error: function(e) {
    alert('저장 실패!');
    JSON.stringify(e);
}
});
}

    // 댓글 목록 load
    function getCmnt() {
    // 서버로 ajax 요청을 보내서 댓글 목록을 받아 반복문으로 화면에 출력
    $.ajax({
        url:'select',
        type:'get',
        dataType:'json',
        success: function(cmntList) {
            console.log(cmntList);

            if (cmntList == null) {
                $('#noCmnt').html('저장된 댓글이 없습니다.');
            }

            let cmnt = '<table>';

            $(cmntList).each(function(i, obj) {
                console.log(i);
                // console.log(this.num);
                // console.log(this.name);
                // console.log(this.text);

                cmnt += '<tr><td>' + (i + 1)
                    + '</td><td>' + obj.name
                    + '</td><td>' + obj.text
                    + '</td></tr>';
            });

            cmnt += '</table>';

            $('#th_comment').html(cmnt);

        } ,
        error: function () {
            console.log('목록 받아오기 실패');
        }
    });
}
