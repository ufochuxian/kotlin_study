package com.eric.myapplication.kotlin;

/**
 * @Author: chen
 * @datetime: 2020/3/29
 * @desc:
 */
interface GenericJava1<E> {

    // Java的协变 ？extends E 规定了符号的"上线"必须为E类型
    //如果我们只从中读取数据，而不往里面写入内容，那么这样的对象叫做生产者，生产者使用 ? extends E,称作"协变"
    void addAll(GenericJava1<? extends E> genericJava1);

    //java的逆变 ？super E 规定了符号的"下线" 只能是E或者E的父类型
    //如果我们只往里面写入数据 而不从中读取，那么这样的对象叫做消费者 消费者使用 ? super E，称作"逆变"
    GenericJava1<? super E> getAll();

}
