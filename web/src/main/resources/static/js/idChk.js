$(document).ready(function () {
   $('#btn').click(idChk);
});

function idChk() {
    // alert('테스트');
    let id = $('#memberid').val();
    // let name = $('#membername').val();

    $.ajax({
        url:'idChk',
        type:'post',
        data: { id:id },
        success: function() {
            let msg = '';
            $('#idLenghtChk').html()
        },
        error: function (e) {
            alert('중복확인 실패');
            JSON.stringify(e);
        }
    })

}