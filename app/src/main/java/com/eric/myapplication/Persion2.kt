package com.eric.myapplication

/**

 * @Author: chen

 * @datetime: 2020/3/29

 * @desc:

 */
// kotlin和java的设计理念上的一个很大的不同，是类默认是不让继承的，如果需要继承，那么需要使用关键字"open"
// 避免java中类被滥用继承的情况
open class Person (userName : String)

class Son(userName: String) : Person(userName)



open class Animal(name : String)

//这里Dog类的后面没有跟上constructor（primary构造方法）
//那么在kotlin中就规定，这种情况下就需要子类使用secondary构造方法，并且使用super关键字来初始化父类型
class Dog : Animal {

    //secondary构造方法 使用super关键字初始化父类型
    constructor(name : String) :super(name)
}