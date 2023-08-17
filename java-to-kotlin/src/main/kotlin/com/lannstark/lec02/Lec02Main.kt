package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main() {
    //safe call: null이 아니면 싱행하고, null이면 실행하지 않는다.(그대로 null)
    val str: String? = "ABC"
//    str.length //불가능
    str?.length //가능
    str?.length ?: 0 // elvis 연산자. 앞의 연산결과가 null이면 뒤의 값을 사용
}

fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

//call safe한 nullable
fun startWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startWithA4(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

//elvis 연산은 early return에도 사용할 수 있다.
fun calculate(number: Long?): Long {
    number ?: return 0
    //다음 로직

    //임시 return
    return 1L
}

//null 아님 단언 !!.
//혹시나 null이 들어오면 NPE가 나오기 때문에, 정말 null이 아닌게 확실한 경우에만 사용
fun startWithA5(str:String?): Boolean {
    return str!!.startsWith("A")
}