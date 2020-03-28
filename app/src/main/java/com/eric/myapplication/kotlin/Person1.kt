package com.eric.myapplication.kotlin

import android.util.Log

/**

 * @Author: chen

 * @datetime: 2020/3/28

 * @desc:

 */
//这种不带修饰符和变量关键字声明的，被认作是类的constructor的参数 （构造方法的参数）
class Person1 (userName : String,age : Int) {

}

//这种带有修饰符和变量关键字声明的，被认作是类的成员变量，使用创建对象的时候可以直接进行赋值，简化写法
class Persion2(var userName: String,private var age: Int)

fun main() {
    var person2 = Persion2("kotlin",2)
    Log.i("", "Persion2 name:${person2.userName}")
}