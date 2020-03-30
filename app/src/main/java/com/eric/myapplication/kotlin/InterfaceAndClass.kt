package com.eric.myapplication.kotlin

/**

 * @Author: chen

 * @datetime: 2020/3/29

 * @desc:

 */
interface Pop {
    fun getPop() {
        println("Pop")
    }
}

open class Boom {
    open fun getPop() {
        println("Boom")
    }
}

class C : Pop,Boom() {
    override fun getPop() {
        //因为kotlin能够实现接口，也能够继承类，如果接口和继承的父类的方法有一样的名字，那么可以用以下的语法来显示声明调用那个
        //<Pop>代表调用接口Pop的

        super<Pop>.getPop()
        super<Boom>.getPop()
    }
}

fun main() {
    C().getPop()
}