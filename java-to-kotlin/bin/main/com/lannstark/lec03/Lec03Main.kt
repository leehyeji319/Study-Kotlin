package com.lannstark.lec03

import java.lang.IllegalArgumentException


fun main() {

    // 코틀린에서는 선언된 기본값을 보고 타입을 추론한다.
    val number1 = 3 //Int
    val number2 = 3L //Long
    val number3 = 3.0f //Float
    val number4 = 3.0 // Double

    /*
    * java: 기본 타입간의 변환은 암시적으로 이루어질 수 있다.
    * kotlin: 기본 타입간의 변환은 명시적으로 이루어져야 한다.
    * */


    // String interpolation / String indexing
    // ${변수}를 사용하면 값이 들어간다.
    val person = Person("최태현", 100) //new 없이!
    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."

    //$변수 를 사용할 수도 있다.
    val name = "최태현"
    val age = 100
    val log2 = "사람의 이름: $name 나이: $age"

    //tip
    //변수 이름만 사용하더라도 ${변수}를 사용하는 것이 1. 가독성, 2.일괄 변환 3.정규식 활용 측면에서 좋다


    val withoutIndent =
        """
            ABC
            
            123
            
            456
        """.trimIndent()
    println(withoutIndent)

    val str = "ABCDE"
    val ch = str[1]
    println(ch)
}

fun plus() {
    val number1: Int = 4
//    val number2: Long = number1 //Type mismatch
    val number2: Long = number1.toLong() //to변환타입() 사용
    println(number1 + number2)
}


//기본 타입이 아니라 일반 타입이라면?
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { //is: java의 instanceof
        val person = obj as Person //as Person: java의 (Person) obj
        println(person.age)
    }
}

//스마트 캐스팅
fun printAgeIfPersonWithStartCast(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}


//instanceof의 반대도 존재할까? 만약 obj에 null이 들어올 수 있다면?
/*
*
* value is Type -> value가 Type이면 true, value가 Type이 아니면 false
* value !is Type -> value가 Type이면 false, value가 Type이 아니면 true
*
* value as Type -> value가 Type이면 Type으로 타입 캐스팅, value가 Type이 아니면 예외발생
*
* value as? Type -> value가 Type이면 Type으로 타입 캐스팅, value가 null이면 null, value가 Type이 아니면 null
*
* */


//kotlin에 있는 특이한 타입 3가지 Any, Unit, Nothing
/*
* Any
* - Java의 Object 역할 (모든 객체의 최상위 타입이다.)
* - 모든 Primitive Type의 최상위 타입도 Any이다.
* - Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현.
* - Any에 equals / hashCode / toString 존재.
*
* Unit
* - Unit은 Java의 void와 동일한 역할
* - void와 다르게 Unit은 그 자체로 타입 인자로 사용이가능하다.
* - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미.
*   즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
*
* Nothing
* - Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
* - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
* */


//Nothing 예제
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}


