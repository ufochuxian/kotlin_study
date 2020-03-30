package com.eric.myapplication.kotlin

/**

 * @Author: chen

 * @datetime: 2020/3/30

 * @desc:

 */


class A {

    class B {

        fun method() {
            println("我是嵌套类B的方法")
        }
    }
}


class F {

    inner class D {
        fun method() {
            println("我是内部类D的方法")
        }
    }
}


fun main() {
    //kotlin的嵌套类，相当于java中的静态内部类（即有static关键字修饰的内部类）
    A.B().method()

    //kotlin的内部类 相当于java中的匿名内部类（没有static关键字修饰的内部类）
    F().D().method()
}


