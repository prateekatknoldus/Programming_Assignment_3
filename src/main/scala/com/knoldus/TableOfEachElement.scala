package com.knoldus

object TableOfEachElement{

  // method to print table of an element
  def printTable(element:Int):Unit={
    print("Table of "+element+" => ")
    for(count<-1 to 10) {
      {
        print(element * count+" ")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val givenList= List(2,5,8,7,3,9,8,14,17,20)

    //print table of each element in the given list
    for (element <- givenList)
    {
      printTable(element)
      println("\n")
    }
  }
}
