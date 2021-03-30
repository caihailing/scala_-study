package com.chl.study.time0329

object Test0329_01_函数 {

  def main(args: Array[String]): Unit = {

    // 6. 写一个函数,取一个大小为3的元组,返回一个大小为6的元组

    def tranTuple(any1 : Any, any2: Any, any3 : Any) : (Any, String, Any, String, Any, String) = {
      (any1, any1 + "", any2, any2 + "", any3, any3 + "")
    }
    println(tranTuple("dad", 123, new Tuple2(1,2)))




  }



}
