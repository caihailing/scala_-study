package com.chl.study.time0403

/**
 * @description
 * @author caihailing
 * @date 2021-04-03 09:54
 */
object Test0403_01_首类函数_练习题 {


  def main(args: Array[String]): Unit = {
    // 6.编写一个名为"cond"的函数,它取一个值x和两个函数p和f,返回与x类型相同的一个值,
    // p函数是一个谓词,取值x,并返回一个布尔值b,f函数也取值x,并返回相同类型的一个新值
    // 这个"cond"函数只在p(x)为true时才调用函数f(x),否则就返回x."cond"需要多少类型参数
      def cond [X] (x : X)(p : X =>Boolean)(f : X => X) : X = if (p(x)) f(x) else x
    // 谓词就是函数类型 入参和出参



    // 7.打印1到100个数字,每行一个数,关键是3的倍数必须替换为"type",5的倍数必须替换为"safe",15的倍数"typesafe"

    def p (x : Int) : Boolean = if (x % 3 == 0 || x %5 == 0) true else false
    def f (x : Int) : Int = {
      var a = x
      if (x % 3 == 0) a = 3
      if (x % 5 == 5) a = 5
      if (x % 3 == 0 && x % 5 == 0) a = 15
      a
    }
    def conds [X] (x : X)(p : X => Boolean)(f : X => X) : X = {
      if (p(x)) {
        f(x)
      } else x
    }

    // 传函数参数的桑场, 直接传名称, 不需要将值传进参数函数中
    for(a <- 1 to 100) {
      val c : Int = conds[Int](a)(p)(f)
      if (c == 3) println("type")
      if (c == 5) println("safe")
      if (c == 15) println("typesafe")
      if (c != 3 && c != 5 && c != 15) println(c)
    }
  }






}
