package com.lannstark.lec01

import java.lang.IllegalArgumentException

fun main() {
    //코틀린은 초기화 필수
    var number1 = 10L
    val number2 = 10L

    /*
    연산을 사용할 때는 Reference Type 대신 Primitive Type을 사용한다
    kotlin에서는 모두 Long인데 성능상 괜찮은가? -> 숫자, 문자, 불리언과 같은
    몇몇 타입은 내부적으로 특별한 표현을 갖는다.
    이 타입들은 실행시에 Primitive Value로 표현이 되지만, 코드에서는 평범한 클래스처럼 보인다.
    즉, 프로그래머가 boxing/unboxing을 고려하지 않아도 되도록 kotlin이 알아서 처리해준다.
    */


    //nullable 변수
    var number3: Long? = 1_000L
    number3 = null

    //객체 인스턴스화
    //코틀린에서 객체 인스턴스화를 할 때에는 new를 붙이면 안된다.
    val person = Person("최태현")


}



