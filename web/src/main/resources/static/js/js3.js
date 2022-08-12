/*
 * 날짜 객체
 */

function outputDate2() {
    let today = new Date();
    let timeDiff = today.getTime() - new Date(2022,8,3,16,50);

    console.log(`초: ${timeDiff / 1000}`);
    console.log(`분: ${timeDiff / 1000 / 60}`);
    console.log(`시: ${timeDiff / 1000 / 60 / 60}`);
    console.log(`일: ${timeDiff / 1000 / 60 / 60 / 24}`);

}

function outputDate() {
    let date = new Date();
    let output = document.getElementById('output');

    output.innerHTML = date;    // 현재 시간날짜정보
    output.innerHTML = date.getFullYear();    // 현재 년도

    let year = date.getFullYear() + '년 ';
    let month = date.getMonth() + 1 + '월 ';         // 월은 0부터 시작
    let day = date.getDate() + '일 ';

    // let h = date.getHours() + '시 ';
    // let m = date.getMinutes() + '분 ';
    // let s = date.getSeconds() + '초';
    let time = date.toLocaleTimeString();

    output.innerHTML = year + month + day + time;

}

function timeout() {
    setTimeout(outputDate, 3000);
}

/* 몇초마다 실행시키는 interval과 그걸 멈추게하는 clearInterval */
let inter = null;

function start() {
    inter = setInterval(outputDate, 1000);
}

function stop() {
    clearInterval(inter);
}

let win = null;
function winMove() {
    // 창 열리고 돌아다님
    inter = setInterval(function(){
        if(win == null || win.closed) {
            win = window.open('', 'win', 'left=100,top=100,width=100,height=100');
        }
        // x축 10씩 이동
        win.moveBy(10,0);

        win.focus();

    },1*1000);

}

function winStop() {
    // 중지와 창 닫힘
    clearInterval(inter);
    if( win != null && !win.closed)
        win.close();
}