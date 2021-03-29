package com.chl.study.time0328


object Test0328_02_表达式 {


  def main(args: Array[String]): Unit = {

//
//    for (x <- 1 to 7) {
//      println(s"Day $x:")
//    }

    // 使用yield 字段后 for 循环中的值会放到一个集合中 返回
//    val col : IndexedSeq[String] = for (x <- 1 to 7) yield {s"Day $x:"}
//    println(col)
//    for (day <- col) println(day + ",")
//
//    val threes = for (i <- 1 to 20 if i%3 == 0) yield i
//    print(threes)

    // 为什么默认类型是不一样>  和<- 后面的数据操作有关>?? strs.split 获取的是一个数组 所以得到的是数组?
//    val strs = "ceshi,ssd,charity"
//    val coll : Array[String]= for (s <- strs.split(",") if s != null if s.size > 0) yield s
//    println(coll)
//
    // 嵌套迭代器中, 有一个迭代器输出为0次 则这个迭代器就不进行迭代
//    val a = for (x <- 1 to 2; y <- 3 to 7; z <- 1 to 1 if z > 10) yield {
//      s"$x: $y : $z"
//    }
//    println(a)
//
//
    // 值帮定的方式将数据处理放在了 for循环语法中
//    val tr :  IndexedSeq[Int]= for(i <- 0 to 8 ; pow = 1 << i) yield pow
//    println(tr)
//
//    val numStr = "0,1,2,3,4,5,6,7,8"
//    val tr2  : Array[Int]= for (i <- numStr.split("," ); pow2 = 1 >> i.toInt) yield pow2
//    println(tr2)
//
    // ===============================练习题===============================

//    val str = "ddd"
//    val ss = str matches {
//      case str != null => {println(s"$str")}
//      case str == null => {println("n/a")}
//    }

    // if else  只能做两目运算,所以碰到多条件的使用匹配表达式 匹配表达式 有些时候大括号可以省略掉
//    val num = 12.12
////    val str = if (num >0) println("greater") if (num == 0) println ("same") if(num < 0) println("less")
//    val str = num match {
//      case num if num > 0 => {"1"}
//      case num if num == 0 => "2"
//      case num if num < 0 => {"3"}
//    }
//    println(str)
//
//
    for (i <- 1 to 100 ; a = i%3 == 0 && i%5 != 0; b = i %5 == 0 && i %3!= 0; c = i %3 ==0 && i%5 ==0 ) {
  if (a == false && b ==false && c == false) println(i)
  if(a) println("type")
  if(b) println("safe")
  if(c) println("typesafe")

}


  }

}
