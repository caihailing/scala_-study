package com.chl.study.time0330

object Test0330_01_首类函数 {

  def main(args: Array[String]): Unit = {


    // 1. 字面量
    // 参数函数类型:f : String => String 输入一个string类型 输出一个String
//    def safeStringOp(s : String, f : String => String) : String = {
//      if (s !=  null) f(s) else s
//    }
//    println(safeStringOp(null, (s: String) => s.reverse))
//    println(safeStringOp("ready", (s : String) => s.reverse))
//    // 显示类型可以不要 会自动匹配
//    println(safeStringOp("ready", s  => s.reverse))
//
//
    // 2. 占位符语法
    // 占位符是函数字面量的一种缩写形式
    // 使用条件: 1.函数的显示类型在字面量之外指定.
    //          2.参数最多只使用一次
//    val doubler : Int => Int = _*2
//    println(doubler(3))
//    // 等价于
//    def dor(x : Int) : Int = x*2
//    val doub : Int => Int = dor
//    println(doub(3))

    // 太简洁了 缩水严重 s => s.reverse = _.reverse
//      def safeStringOp (s : String, f : String => String) = {
//        if (s != null) f(s) else s
//      }
//      println(safeStringOp(null, _.reverse))

    // 可以看出来 两个通配符其实代表的是两个输出参数,x和y 而通配符之间的加减乘除并不重要,只要它们结果是一个Int就行
//      def combination(x : Int, y : Int, z : Int, f : (Int, Int, Int) => Int) = f(x, y, z)
//      println(combination(23, 12, 2, _*_/_))
    // def[type] type 可以指定后面带的参数的类型
    // 例如下面的例子
//        def tripOp[A,B] (a : A, b : B, f : (A, B) => B) = f(a,b)
//        println(tripOp[Int, Int](1, 1, _+_))


    // 3.部分应用函数和柯里化
    def factorOf(x : Int, y : Int) = y % x == 0
    val f = factorOf _
    println(f(7, 20))

    val multipleOf3 = factorOf(3, _ : Int)
    println(multipleOf3(78))


  }



}
