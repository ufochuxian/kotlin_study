package com.eric.myapplication.kotlin

/**

 * @Author: chen

 * @datetime: 2020/3/29

 * @desc:

 */

class GenericPerson<N>(n : N) {

    private var name : N = n

    fun get() : N = this.name

}


fun main(myClass: GenericPerson<String>) {
    var genericPerson : GenericPerson<Any> = GenericPerson<Any>("haha")

    genericPerson.get()
}