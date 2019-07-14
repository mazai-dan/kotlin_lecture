package com.mazai.kotlin4

import java.lang.Exception
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/*
    关于属性委托的要求：
    对于只读属性来说（val修饰的属性），委托需要停供一个名为getValue的方法，该方法接收如下参数：
    - thisRef,需要是属性拥有者相同的类型或是父类型（对于扩展属性来说，这个类型指的是被扩展的那个类型）
    - property， 需要时Kproperty<*>类型或是其父类型

    getValue方法需要返回与属性相同的类型或是其子类型

    对于可变属性来说（var修饰的属性），委托需要再提供一个名为setValue的方法，该方法需要接受如下参数：
    -thisRef,与getValue方法的thisRef要求一致
    -property,与getValue方法的property要求一致
    -new value，需要与属性的类型相同或是其父类型

    getValue与setValue方法既可以作为委托类的成员方法实现，也可以作为其扩展方法来实现

    这两个方法都必须要标记为operator关键字。对于委托类来说，它可以实现ReadOnlyProperty或是ReadWriteProperty接口，这些接口包含了相应的
    getValue与setValue方法

    委托转换规则：

    对于每个委托属性来说，Kotlin编译器在底层会生成一个辅助的属性，然后将对原有属性的访问委托给这个辅助属性。
    比如说，对于prop来说，Kotlin编译器所生成的隐含的属性名为prop$delegate属性,然后对原有的prop属性的访问器的
    访问都只是委托给这个额外的，Kotlin所生成的辅助属性。
 */

/*
    提供委托(providing a delegate)

    通过定义provideDelegate operator，我们可以扩展委托的创建逻辑过程。
    如果对象定义了provideDelegate方法，那么该方法就会被调用来创建属性委托实例
 */
class propertyDelegate :ReadOnlyProperty<People,String>{
    override fun getValue(thisRef: People, property: KProperty<*>): String {
        return "hello world"
    }

}


class PeopleLauncher{
    operator fun provideDelegate(thisRef:People,property:KProperty<*>):ReadOnlyProperty<People,String>{
        println("welcome")

        when(property.name){
            "name","address1" -> return propertyDelegate()
            else -> throw Exception("not valid name")
        }
    }
}
class People{
    val name: String by PeopleLauncher()
    val address: String by PeopleLauncher()
}

fun main() {
    val people = People()
    println(people.name)
    println(people.address)
}