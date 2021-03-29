package com.chl.study.time0328

object Test0328_03_函数 {


  def main(args: Array[String]): Unit = {

    // 递归函数
    //    val i = power (2, 1, 1)
    //    println(i)
    //


    // 使用* 号可以匹配多个参数
    //    def sum(items: Int*) = {
    //      var total = 0
    //      for (i <- items) total += i
    //      total
    //    }
    //
    //
    //    println(sum(10, 20, 30, 80))


    // 类型参数 需要先定义一个[]中括号中加一个值来代表某一个类型输入的参数也有这种有点类似java中的泛型 T
    //    def csMethod[T] (a: T) : T = a
    //    val s : String = csMethod[String]("haaa")
    //    println(s)
    //    val dou : Double = csMethod[Double](12.1)
    //    println(dou)


    // =======================练习===============================


    // 1. 计算圆的面积πr平方
    //    def area(r : Double) : Double = {
    //      var tt = 3.141592
    //      tt*r*r;
    //    }
    //    println(area(22))

    // 2.尾递归 5到50 的 %5
    //    @annotation.tailrec
    //    def tailRecursion(t: Int): Unit = {
    //
    //      println(t)
    //      if (t < 50)
    //      tailRecursion(t + 5)
    //    }
    //    println(tailRecursion(5))

    // 3.第一个值为第二个值的幂
    //    def square(a : Double, b : Double) : Double = {
    //      math.pow(a, b);
    //    }
    //    println(square(2,1))

//    //4. 计算一对2D点之差
//    def diff(a: (Int, Int))(b: (Int, Int)): (Int, Int) = {
//      (a._1 - b._1, a._2 - b._2)
//    }
//    val a : (Int, Int)=  diff(1,3) (2,5)
//    println(a)

      // 5.元组取值  isInstanceOf  asInstanceOf 都需要用点去将方法点出来
//    def tupleValue(t : Any) : Int = {
//      if (t.isInstanceOf[(Int, Any)]) {
//        println(s"2个值的元组,第一位含有Int:${t}" )
//        t.asInstanceOf[(Int ,Any)]._1
//      }
//      else -1
//    }
//    println(tupleValue((2,3)))

//    def tupleValueMatch(t : Any) : Int = {
//      val a : Int = t match {
//        case b if t.isInstanceOf[(Int, Any)] => {
//          t.asInstanceOf[(Int ,Any)]._1        }
//      }
//      a
//    }
//    println(tupleValueMatch((2,3)))

    // 6.





  }


  /**
   *
   * @param x
   * @param y
   * @return
   */
  def power(x: Int, y: Int): Long = {

    if (y < 1) 1
    else x * power(x, y)
  }

  @annotation.tailrec
  def power(x: Int, n: Int, t: Int = 1): Int = {
    if (n < 1) t
    else power(x, n - 1, x * t)
  }


}
