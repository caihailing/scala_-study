package com.chl.study.time0331

object Test0331_01_首类函数 {


  def main(args: Array[String]): Unit = {

    // 1.部分应用函数和柯里化
//    def factorOf(x : Int)(y : Int) = y % x == 0
//    val isEven = factorOf(2) _
//    println(isEven(32))
//    // todo 占位符在前面的时候需要把显式参数带上,不然会报错.为什么上面的不报错, 疑问号????
//    val isEvens = factorOf (_ : Int)(19)
//    println(isEvens(19))
//    val isEvenss = factorOf (_ : Int)(_: Int)
//    println(isEvenss(19,19))
//    函数柯里化: 就是指将一个多参数的函数分解为应用参数和非应用参数.在使用的时候只用应用参数,非应用写死
    // 类似如factorOf (_ : Int)(19)   和   factorOf(2) _


    // 2. 传名参数 (: => <type>)
    // 使用传名参数时, 如果参入的参数是值,则和普通的函数一样.
    // 如果传入的参数是函数,则每次使用参数都会调这个函数.
    def doubles (x : => Int) = {
      println("now doubing" + x)
      x*2
      x*2  // x的每一次调用都会先调用一次f(8),通过函数中x的出现的次数就可以统计出x的调用次数
      x*2
      x*2
      x*2
      x*2
      x*2
    }
    println(doubles(5))
    def f (i : Int) = {println(s"Hello from f($i)"); i}
    println(doubles(f(8)))


    //3.偏函数








  }
}
