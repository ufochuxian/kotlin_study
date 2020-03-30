package com.eric.myapplication.kotlin

/**

 * @Author: chen

 * @datetime: 2020/3/29

 * @desc:

 */


class MyGeneric<T> (t : T) {
    var mVariable : T = t
}


fun main() {
    var generic = MyGeneric<String>("hello")

    println(generic.mVariable)
}