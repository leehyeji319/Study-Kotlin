package com.lannstark.lec04

fun main() {

    // 비교 연산자와 동등성, 동일성
    /*
    * java, kotlin의 비교 연산자와 동등성, 동일성의 사용법은 동일합니다. 단,
    * java와 다르게 객체를 비교할 때, 비교 연산자를 사용하면 자동으로 compareTo를 호출해준다!
    *
    * 동등성(Equality): 두 객체의 값이 같은가?
    * 동일성(Identity): 완전히 동일한 객체인가? 즉, 주소가 같은가?
    *
    * java는 동일성에 ==를 사용, 동등성에 equals를 직접호출
    * kotlin에서는 동일성에 ===를 사용, 동등성에 ==를 호출, ==를 사용하면 간접적으로 equals를 호출한다.
    *
    *
    *
    * && || ! 논리연산자: java와 완전히 동일합니다. java처럼 lazy 연산을 수행합니다.
    *
    * in / !in
    *   - 컬렉션이나 범위에 포함되어 있다, 포함되어있지 않다.
    *   - println(1 in numbers)
    *
    * a..b
    *   - a부터 b까지 범위 객체를 생성한다.
    *   - <코틀린에서 반복문을 다루는 방법>에서 확인가능
    *
    * a[i]
    *   - a에서 특정 Index i로 값을 가져온다. (약간 python 같은 면도 있네요)
    *
    * a[i] = b
    *   - a의 특정 index i에 b를 넣는다.
    * */

    //연산자 오버로딩
    //코틀린에서는 객체마다 연산자를 직접 정의할 수 있다.
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(2_000L)
    println(money1 + money2) // JavaMoney(amount=3000)

}
