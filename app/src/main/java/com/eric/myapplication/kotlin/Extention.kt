package com.eric.myapplication.kotlin

/**

 * @Author: chen

 * @datetime: 2020/3/29

 * @desc:

 */

open class Parent

class Son : Parent()

fun Parent.name(p : Parent) = run { println("parent") }

fun Son.name(p : Parent) = run { println(p.name(this)) }

fun main() {

    //这里虽然传入的是son的对象，但是因为扩展函数是静态解析的，不支持多态的机制，只跟声明对象有关
    //所以这里打印出来的还是parent,因为扩展函数接收的参数的类型是parent
    Son().run {
        name(this)
    }
}