package com.mazai.kotlin9

//注解(annotation)
//meta-annotation
/*
    @Target 指定可以用该注解标注的元素的可能的类型（类、函数、属性、表达式等）；
    @Retention 指定该注解是否存储在编译后的 class 文件中，以及它在运行时能否通过反射可见 （默认都是 true）；
    @Repeatable 允许在单个元素上多次使用相同的该注解；
    @MustBeDocumented 指定该注解是公有 API 的一部分，并且应该包含在生成的 API 文档中显示的类或方法的签名中。
 */

@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY_GETTER,AnnotationTarget.PROPERTY_SETTER,AnnotationTarget.CONSTRUCTOR,AnnotationTarget.EXPRESSION,AnnotationTarget.FIELD,AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class MyAnnotation


class MyClass{

    @MyAnnotation
    fun myMethod(a:Int):Int = @MyAnnotation 10
}

class MyClass2 @MyAnnotation constructor(a:Int){}

class MyClass3  {
    var a:Int ? = null
      @MyAnnotation set
}