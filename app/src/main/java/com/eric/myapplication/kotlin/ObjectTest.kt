package com.eric.myapplication.kotlin

/**

 * @Author: chen

 * @datetime: 2020/3/29

 * @desc:

 */
object MyObj {

    fun method() {
        println("[MyObj]")
    }
}

class TestObj {

    companion object MyObj {
        const val age = 2
    }
}

fun main() {
    println(TestObj.age)
}