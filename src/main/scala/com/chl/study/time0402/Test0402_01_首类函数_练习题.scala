package com.chl.study.time0402

/**
 * @description 首类函数练习题
 * @author caihailing
 * @date 2021-04-02 19:09
 */
object Test0402_01_首类函数_练习题 {

  // 1. 写一个函数字面量,取两个整数,并返回较大的一个数.然后写一个高阶函数,取一个大小为3的整数元组并结合这个函数字面量
  //    用它返回这个元组中的最大值.
  def twoGetOne (a : Int, b : Int) = if (a>b) a else b
  val i = (a : Int, b : Int) => if (a>b) a else b
  def threeGetOne (a : Int, b : Int, c : Int): Int = i(i(a, b), c)

  // 2.库函数util.Random.nextInt()会返回一个随机整数.用它调用"max"函数,提供两个随机整数和一个函数(这个函数返回两个给定整数中较大的一个).
  // 利用另外一个函数(返回两个给定整数中较小的一个)做同样的处理,然后再提供另外一个函数每次返回第二个整数.
  val a = util.Random.nextInt()
  val b = util.Random.nextInt()
  def getMax (a : Int, b : Int) : Int = if (a > b) a else b
  def max(a : Int, b : Int)(f : (Int, Int)=> Int) =f(a,b)

  def twoGetMin (a : Int, b : Int) : Int = if (a > b) b else a
  def min (a : Int, b : Int) = {
    if (a > b) b else a
  }

  // 3.写一个高阶函数,它取一个整数并返回一个函数.返回的函数有一个整数参数(如:"x"),并返回x与传入这个高阶函数的整数乘积
  def inx(x : Int) = x*x
  def ops(x : Int) = inx(x)


  // 6.
//  def p(x : Any) : Boolean = b

  // 传函数参数的桑场, 直接传名称, 不需要将值传进参数函数中

}
