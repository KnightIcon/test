package com.rookie.chapter05

object TestPracticeCollection {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1,2,3,4)
    //对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组；
    def arrayOperations(array: Array[Int], op: Int=>Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    //定义加一操作；
    def addOne(elem: Int):Int = {
      elem + 1
    }

    //调用函数；
    val newArray: Array[Int] = arrayOperations(arr,addOne)
    println(newArray.mkString(","))

    //传入匿名函数，实现元素翻倍；
    val newArray2 = arrayOperations(arr, _ * 2)
    println(newArray2.mkString(","))
  }
}
