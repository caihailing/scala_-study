package com.chl.study.time0403

import scala.collection.mutable

/**
 * @description
 * @author caihailing
 * @date 2021-04-03 22:27
 */
object Test0403_03_更多集合 {


  def main(args: Array[String]): Unit = {

    // 1. 编写一个函数,返回斐波那契数列中前x个元素的一个列表,你能用buffer来实现吗?
    def fibo(x : Int)  = {
      val list: mutable.Buffer[Int] = mutable.Buffer()
      if (x >= 1) list += 1
      if (x >= 2) list += 1
      for (i <- 3 to x) list += list(i -2) + list(i -3)
      list.toList
    }
    println(fibo(10))

    // 2.编写一个新的斐波那契数列,将新的和旧的合二为一
    val list1 = fibo(3)
    val list2 = fibo(4)
    val list3 = list1 ::: list2
    println(list3)

    // 3.stream集合创建 ??? stream使用的ipa 不熟悉,无从下手
//    def fibo2(x : Int) : Stream[Int] = x match {
//      case x == 1 => Stream[Int](1)
//      case x == 2 => Stream[Int](1,1)
//      case x >= 3 => Stream(x - 1)
//    }

    // 4.输入fibNext(8) 获取8的下一个元素13,处理非法的
    val lis = fibo(20);
    def fibNext(i : Int) : Int = {
      if (!lis.contains(i)) {
        println("请输出正确的斐波那契数列元素")
        -1
      }
      else {
        val index = lis.indexOf(i)
        lis(index + 1)
      }
    }
    println(fibNext(8))

    // 5.获取文件列表
    def getFiles(path : String) = {
      val files = new java.io.File(path).listFiles()
      println(files.map(_.getName).toList.filterNot(_.indexOf(".") == 0).foreach(x => print(x + ";")))
    }

    getFiles("/Users/Shared/Previously Relocated Items/Security")

  }



}
