package com.lannstark.lec05

import java.lang.IllegalArgumentException

fun main() {

}

//kotlin의 if문
/*
* if (조건) {
*   내용
* }
* */

fun validateScoreIsNotNegative(score: Int) { //함수에서 Unit(void)이 생략됨
    if (score < 0) {
        //new를 사용하지 않고 예외를 throw
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}
//위의 코드도 자바와 똑같이 생겼지만, java와 다른점이 있다.
/*
* java에서 if-else는 statement이지만, kotlin에서는 Expression이다.
* 이게 뭔말인고??
* statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다.
* expression: 하나의 값으로 도출되는 문장
* 자, 예를 들어서
* int score = 30 + 40; -> Expression이면서 Statement이다.
* */

fun getPassOrFail1(score: Int): String {
    //이렇게 하면, expression타입으로 가능하다.
    val grade: String = if (score >= 50) {
        "P"
    } else {
        "F"
    }
    return grade
}

fun getPassOrFail2(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

//매우 중요한 개념
/*
* 정리: java에서 if-else는 Statement이지만, Kotlin에서는 Expression입니다.
*
* Kotlin에서는 if-else를 expression으로 사용할 수 있기 때문에, 3항 연산자가 없습니다.
*
* */

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

//간단한 팁! 어떠한 값이 특정 범위에 포함되어있는지, 포함되어있지 않은지
// if (0 <= score && score <= 100)
// if (score in 0..100)  이렇게 바꿀 수 있다.