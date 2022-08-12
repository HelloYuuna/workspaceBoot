/*
 * 어디가 먼저 실행되나~?
 * 1 3 4 2 순으로 실행되며,
 * 돔트리가 완성되지 않은 상태에서 실행되는 코드 :
 * 1번과 3 4번같은 코딩은 피하는것이 좋다 => 자바스크립트 미작동의 원인이 될 수 있음
 */
// alert('1');                         // 가장 먼저 실행

/* dom 완성 후 로드 */
window.onload = function() {
    let btn1 = document.getElementById('btn1');
    btn1.onclick = test1;
    // alert('2');                     // 4번째 실행
}

function test1() {                  // 호출 후 실행
    alert('test1');
}

// 기본문법
function test2() {
    /* hoisting (var만 호이스팅: undefined)
        console.log('var a = ' + a);
        console.log('let b = ' + b);
        console.log('const c = ' + c);
    */

    var a = 1;                      // 변수 중복 선언 가능 > ES6 이전
    let b = 2;                      // 중복 선언 불가, 변수의 재할당 가능 mutable
    const c = 3;                    // 중복 선언 불가, 자바의 final 역할 (상수) 재할당 불가 immutable

    // var a = 1;
    // let b = 2;
    // const c = 3;

    a = 3;
    b = "55";
    // c = 100;            // Error!

    console.log('var a = ' + a);
    console.log('let b = ' + b);
    console.log('const c = ' + c);

    /* 타입? */
    console.log(typeof(a));
    console.log(typeof(b));

    /* 숫자로 파싱가능? is not a number */
    console.log(isNaN(a));
    console.log(isNaN(b));

    /* 연산 */
    console.log(a+1);   // 4
    console.log(b+1);   // 551
    console.log(parseInt(b)+1);   // 56  parsing
    console.log(Number(b)+1);   // 56  parsing

    let d = prompt('정수를 입력');   // 입력받는 값은 무조건 String
    console.log(typeof (d) + ', ' + d);

    let e = confirm('질문?');
    console.log(typeof (e) + ', ' + e);
}

// 계산기
function test3() {
    let t1 = document.getElementById('text1');
    let t2 = document.getElementById('text2');
    let result = document.getElementById('result');
    let t3 = document.getElementById('text3');

    t3.value = parseInt(t1.value) + Number(t2.value);
    result.innerHTML = "<br>result: " + t3.value;

}
