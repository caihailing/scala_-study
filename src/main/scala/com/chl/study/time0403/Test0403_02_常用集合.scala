package com.chl.study.time0403

/**
 * @description
 * @author caihailing
 * @date 2021-04-03 12:13
 */
object Test0403_02_常用集合 {


  def main(args: Array[String]): Unit = {

    //1.创建一个列表,包含前20个long奇数,你能用一个for循环,filter操作以及map操作创建这个列表吗
    // 编写这个代码最高效, 表述性最好的方法是什么
    //    var s: List[Long] = Nil
    //    for (x <- Long.MinValue to Long.MinValue + 20) {
    //      val a: List[Long] = x :: s
    //      s = a
    //    }
    //    println(s)


    // 2.写一个名为"factors"的函数,它取一个数,返回这个数的因数构成的一个列表(除了1和它本身) 例如: factors(15) 返回List(3,5)
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)

    def factorList(x: Int): List[Int] = {
      var s: List[Int] = Nil
      for (a <- 2 until x; b <- 2 until x) {
        if (a * b == x) {
          if (a == b) s = List(a)
          else s = List(a, b)
        }
      }
      s
    }
    // 下面两种是等价的
    println(list.map(factorList).flatten)
    println(list.flatMap(factorList))

    // 3.写一个函数first[A](items : List[A], count : Int) : List[A],这会返回一个给定列表中的前x个项
    // 例如: first(List('a', 't', 'o'), 2),应当返回List('a', 't').可以把它写成一个单行函数,直接
    // 调用一个完成这个任务的内置列表操作,或者更好的做法是实现自己的解决方案
    def first[A](items: List[A], count: Int): List[A] = items take count
    println(first(List('a', 't', 'o'), 2))


    // 4.

    // 7
    val url : String = "http://api.openweathermap.org/data/2.5/forecast?mode=xml&lat=55&lon=0"
    val l : List[String] = io.Source.fromURL(url).getLines().toList
    println(l)



  }


}
