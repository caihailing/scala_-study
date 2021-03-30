package com.chl.study.time0329

object Test0329_02_首类函数 {

  def main(args: Array[String]): Unit = {

    //1.函数类型和值
    // 将函数当成一个值 进行传递  ([<type>, ...]) => <type>
    // scala 里面, 入参出参 都可以用函数来表示
//    def double(x : Int) : Int = x*2
//    println(double(3))
//    val  myDouble : (Int) => Int = double
//    println(myDouble(3))
//    val myDoubleCopy = myDouble
//    println(myDoubleCopy(3))


    // 2. 高阶函数
    //f : String => String  表示入参是字符串 出参也是字符串的一个函数
//      def safeString (s: String, f : String => String) = {
//      if (s != null) f(s) else s
//    }
//      def reverser(s : String) : String = s.reverse
//      println(safeString(null, reverser))
//      println(safeString("shazi", reverser))
//


    // 3.函数字面量 可以称为匿名函数/lambda表达式
    // 函数字面量 可以看成是将带函数参数的函数转换而来
    // 如 下面一个是用函数字面量,一个是用带函数参数的函数,两者结果是相同的
//    val doubler = (x : Int) => x * 2
//    println(doubler(22))
//
//    def aad(x : Int) : Int = x * 2
//    val a : (Int) => Int = aad
//    println(a(22))

    // maximize1 和 maximize2 底层实现原理其实是一样的
    // (Int, Int) => Int = <function2>
    def max(a : Int,  b : Int) = if (a > b) a else b
    val maximize1 : (Int , Int) => Int = max
    val maximize2 = (a :Int, b : Int) => if (a > b) a else b







  }



}
