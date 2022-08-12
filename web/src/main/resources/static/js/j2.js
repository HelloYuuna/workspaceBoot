let win = null;

function test1() {
    win = window.open('','w','width=400,height=500,left=550,top=150');
}

function test2() {
    // alert(win);
    // alert(win.closed);           // 닫혀있는지 확인 boolean 타입
    if( win != null && !win.closed ) {win.close();}
}

function test3() {
    if( win != null && !win.closed ) {
        win.resizeTo(100, 200);
        win.moveTo(300, 100);
        win.focus();
    }
}

/* screen 객체 */
function test4() {
    // 가로세로 해상도
    alert('가로: ' + screen.width + '\n세로: ' + screen.height);
}

/* location 객체 */
function test5() {
    alert(location.href);                       // 현재 브라우저 위치(링크)
    location.href='https://www.naver.com';
}

/* history 객체 */
function test6() {
    // 음수와 양수로 앞 뒤 이동 범위를 조절
    history.go(-1);                 // 한단계 뒤로 돌아가기
}

/* navigator 객체 */
function test7() {
    // 브라우저 및 운영체제 정보 호출;
    alert(navigator.userAgent);

    let words = ['Mobile', 'SAMSUNG', 'iPhone'];
    if(navigator.userAgent.includes(words)) {

    }
}
