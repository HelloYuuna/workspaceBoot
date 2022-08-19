
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

                // 저장 후 내용을 비워줌
                $('#name').val('');
                $('#cmnt').val('');

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
            success: output,
            error: function () {
                console.log('목록 받아오기 실패');
            }
        });
    }

    function output(cmntList) {
        console.log(cmntList);

        if (cmntList == null) {
            $('#noCmnt').html('저장된 댓글이 없습니다.');
        }

        let cmnt = '<table>';

        $(cmntList).each(function(i, obj) {
            // console.log(i);
            // console.log(this.num);
            // console.log(this.name);
            // console.log(this.text);
            cmnt += '<tr><td>' + (i + 1)
                + '</td><td>' + obj.name
                + '</td><td>' + obj.text
                + '</td>'
                + '<td><input type="button" value="Delete" class="btnDel" num="'+ obj.num +'">'
                + '</td></tr>';
        });

        cmnt += '</table>';

        // 목록 출력 영역어 삽입
        $('#th_comment').html(cmnt);

        // 삭제 버튼들에 대한 클릭이벤트 처리
        $('.btnDel').on('click', commentDel);
    }

    // 삭제버튼 이벤트
    function commentDel() {
        // 몇번 글의 버튼을 눌렀는지 확인
        let num = $(this).attr('num');
        console.log(num);

        // 삭제 할지말지 질문
        if(!confirm('정말 삭제하시겠어?')) { return; }

        // 번호를 서버로 전달하여 글 삭제
        $.ajax({
            url:'cmntDel',
            type:'get',
            data: { num:num },
            success: function (res) {
                // 삭제하고 돌아와서 확인메시지 출력
                if ( res > 1) { alert('삭제에 실패하였습니다.'); }
                alert('삭제되었습니다.');

                // 댓글내용 새로고침
                getCmnt();
            }
            ,
            error: function (e) {
                alert('삭제실패!');
                JSON.stringify(e);
            }
        });

    }
