package com.eric.myapplication.kotlin

/**

 * @Author: chen

 * @datetime: 2020/3/29

 * @desc:

 */

class DD {

    fun method() {
        println("I am DD")
    }

    override fun toString(): String {
        println("DD toString")
        return super.toString()
    }
}

class EE {


    //在类EE里面（分发接收者），给类DD添加一个扩展函数，那么再这个扩展函数中
    //即可以使用"DD"（扩展接收者）的方法和属性，也可以使用"分发接受者"（EE）的属性和分发
    open fun DD.method2() {
        method()
        method2()

        //在扩展函数中使用this关键字，那么代表的是当前扩展的类的对象，也就是扩展接收者的对象
        this.toString()
        //如果需要调用分发接收者中同名的方法，那么需要显示指出
        this@EE.toString()

    }

    override fun toString(): String {
        println("EE toString")
        return super.toString()
    }

}

fun main() {
    DD().method()
}

