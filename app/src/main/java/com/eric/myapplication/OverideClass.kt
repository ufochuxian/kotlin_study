package com.eric.myapplication

/**

 * @Author: chen

 * @datetime: 2020/3/29

 * @desc:

 */

// 在kotlin中在语法层面上，就规定了class继承还是method继承，都需要显示使用open关键字来进行声明
// 在语义上更加清晰
open class Fruit(private val name: String) {

    open val type : String = "Fruit"

    open fun say() {
        print("I am $name")
    }

}


class Apple(private var name: String) : Fruit(name) {

    override val type: String
            get() = "Apple    " + super.type

    override fun say() {
        print("I am $name")
    }
}

fun main() {
    print("${Apple("apple").type}")
}