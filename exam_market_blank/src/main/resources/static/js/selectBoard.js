
$(document).ready(function () {
    // 버튼누르면 댓글 등록 및 가져오기
    $('#btn_submit').click(insertRpy);

    // 댓글 리스트 가져오기
    selectRpy();
});

// 댓글 등록
function insertRpy() {
    let replytext = $('#replytext').val();
    let boardnum = $('#boardnum').val();

    $.ajax({
        url:'insertRpy',
        type:'post',
        data: { replytext:replytext, boardnum:boardnum },
        success: function() {
            replytext = '';
            selectRpy();                        // 댓글 목록 읽어오기
        },
        error: function(e) {
            JSON.stringify(e);
        }
    });
}

// 댓글 가져오기
function selectRpy() {
    let reply = '';

    $.ajax({
        url:'selectRpyAll',
        type: 'get',
        success: function(replies) {
            reply = '<table>';

            $(replies).each(function(){
                reply += '<tr><td>'+ this.memberid +'</td>';
                reply += '<td>'+ this.replytext +'</td>';
                reply += '<td>'+ this.inputdate +'</td></tr>';
            })

            reply += '</table>';
            $('#replyList').html(reply);

        },
        error:function(e) {
            JSON.stringify(e);
        }
    })
}

/* 게시글 삭제 및 구매하기 */

function deleteBoard(boardnum) {
    // alert(boardnum);
    if(confirm("정말 삭제하시겠습니까?")) {
        location.href = 'delete?boardnum=' + boardnum;
        return;
    }

    alert("삭제를 취소하였습니다.");
}

function buyProduct (boardnum) {
    if(confirm("구매를 진행하시겠습니까?")) {
        location.href = 'update?boardnum=' + boardnum;
        return;
    }

    alert("구매를 취소하였습니다.");
}