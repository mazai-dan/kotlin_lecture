package com.mazai.kotlin2

/*
    Kotlin：声明处协变； Java：使用处协变

    Kotlin中的out关键字叫做variance annotation，因为它是在类型参数声明处指定的，因此我们称之为
    声明处协变(declaration-site variance)

    对于Java来说则是使用出协变(use-site variance)，其中类型通配符使得协变成为可能
*/

//如果一个类里面的泛型是协变类型的话，它只能用于返回类型
/**
 * 如果泛型类只是将泛型类型作为方法的输出类型，那么我们可以使用out
 *
 * product = output = out
 */
interface Producer<out T> {
    fun produce(): T
}

/**
 * 如果泛型类只是将泛型类型作为其方法的输入类型，那么可以使用in
 *
 * consume = input = in
 */
interface Consumer<in T> {
    fun comsumer(t: T)
}

/**
 * 如果泛型类同时将泛型类型作为方法的输入类型与输出类型，那么我们就不能使用out和in来修饰泛型
 */
interface ProducerConsumer<T> {
    fun methodProduct(): T

    fun methodConsumer(t: T)
}


open class Fruit

open class Apple : Fruit()

class ApplePear : Apple()

class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        println("Product Fruit")
        return Fruit()
    }
}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        println("Product Apple")
        return Apple()
    }
}

class ApplePearProducer : Producer<ApplePear> {
    override fun produce(): ApplePear {
        println("product ApplePear")
        return ApplePear()
    }
}

fun main() {

    //对于out泛型来说，我们可以将子类型对象赋给父类型的引用
    val producer1: Producer<Fruit> = FruitProducer()
    val producer2: Producer<Fruit> = AppleProducer()
    val producer3: Producer<Fruit> = ApplePearProducer()

    println("-----------------")

    //对于“in”泛型来说，我们可以将父类型对象赋给子类型引用
    val consumer1: Consumer<ApplePear> = Human()
    val consumer2: Consumer<ApplePear> = Man()
    val consumer3: Consumer<ApplePear> = Woman()
}

class Human : Consumer<Fruit> {
    override fun comsumer(t: Fruit) {
        println("Consume Fruit")
    }
}

class Man : Consumer<Apple> {
    override fun comsumer(t: Apple) {
        println("Consume Apple")
    }
}

class Woman : Consumer<ApplePear> {
    override fun comsumer(t: ApplePear) {
        println("Comsume ApplePear")
    }
}


