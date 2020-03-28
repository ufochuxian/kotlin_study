package com.eric.myapplication.kotlin

/**

 * @Author: chen

 * @datetime: 2020/3/28

 * @desc:

 */
//第一个constructor是第一构造函数 primary constructor
class Person constructor(userName : String) {

    private val userName = userName
    private var age = 0

    private var address = ""

    init {
        //这个init方法，可以用作成员变量或者一些初始代码的执行
    }

    //secondary constructor方法
    constructor(userName: String, age: Int) : this(userName) {
        this.age = age
    }

    //third constructor方法
    constructor(userName: String, age: Int, address: String) : this(userName, age) {
        this.address = address
    }
}