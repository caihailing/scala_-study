package com.chl.study.time0401

object Test0401_01_首类函数 {

  def main(args: Array[String]): Unit = {


    // 1.偏函数
    // scala的偏函数是可以对输入应用一系列的case模式的函数字面量,要求输入至少与给定的模式之一匹配
    // 通俗的来说,就是输入的参数, 是有过滤条件的,不满足条件的会抛出异常
    // 类似于限定你只能输入1到100  这个时候输入101 就会异常

//    val statusHandler : Int => String = {
//      case 200 => "okay"
//      case 400 => "your error"
//      case 500 => "server error"
//    }

    // 此时 会抛出 scala.MatchError  匹配错误 没有找到9000 这个数字对应的string
    // 感觉 没什么鸟用, 正常代码编写, 这些错误都会被处理掉 除非故意抛出异常
//    println(statusHandler(9000))


    //2.用函数字面量块调用高阶函数
//    def safeStringOp(s : String, f : String => String) = {
//      if (s != null) f(s) else s
//    }
//
//    val uuid = java.util.UUID.randomUUID().toString;
//    // take(24) 表示截取前24位
//    println(safeStringOp(uuid, {
//      s =>
//        val now = System.currentTimeMillis()
//        val timed = s.take(24) + now
//        timed.toUpperCase
//    }))
//    // 上面的写法 很明显不够美观
//    // 所以一般会将参数拆开,各自单独
//    def safeStringOp2(s : String)(f : String => String) = {
//      if (s != null) f(s) else s
//    }
//    // 第二个参数其实可以不要括号  多写个括号 只是提示自己这个其实是存在一个括号的  只是简写了
//    println(safeStringOp2(uuid)({
//      s =>
//        val now = System.currentTimeMillis()
//        val timed = s.take(24) + now
//        timed.toUpperCase
//    }))

    // 下面的例子 有点难懂
    // todo ??? 是不是可以理解为,当传名函数的参数使用字面量代码块来表示时,
    //  如果传名函数内部没有立马调用参数,则先执行传名函数的内容,再执行代码块内容
    def timer[A](f : => A) : A = {
      def now = System.currentTimeMillis()
      val start = now
      println("cs2")
//      val a = f     //这个代码不注释掉时,先执行cs2 =>cs =>print=>double
      //                         注释掉后    cs2 =>print=>cs=>double
      val end = now
      println(s"Executed in ${end - start} ms")
      f
    }
    // util.Random.nextDouble() 方法用于从此随机值生成器生成介于0.0和1.0之间的下一个伪随机双精度值
    val very = timer{
      println("cs")
      util.Random.nextDouble()
    }
    println(very)

















  }
}
