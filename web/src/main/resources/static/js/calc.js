
function calculator() {
    let t1 = document.getElementById('text1');
    let num1 = Number(t1.value);
    let t2 = document.getElementById('text2');
    let num2 = Number(t2.value);
    let oper = document.getElementById('oper').value;

    if(isNaN(num1) || isNaN(num2)) {
        alert('숫자만 입력해주세요');
        return;
    }

    if ( t1.value === '' || t2.value === '' ) {
        alert("값을 입력해주세요");

        if (t1.value === '') {
            focusIn(t1);

        } else {
            focusIn(t2);
        }

        return;
    }

    let result = 0;
    switch (oper) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            // infinity 처리
            if(num2 === 0) {
                alert("Infinity! 0으로 나눌수 없음!");
                t2.value = '';
                t2.select();
                return;
            }
            result = num1 / num2;
    }

    let t3 = document.getElementById('text3');
    t3.value = result;

}

function focusIn(obj) {
    obj.value = '';
    obj.select();
}
