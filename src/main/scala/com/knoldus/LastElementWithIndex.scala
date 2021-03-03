package com.knoldus

object LastElementWithIndex {

  // method to find last element of a list and its index value
  def findLastElementWithIndex(inputList:List[Int]):List[Int]={
    val lastElementIndex=inputList.length-1
    val lastElement=inputList(lastElementIndex)
    List(lastElement,lastElementIndex)
  }

  def main(args: Array[String]): Unit = {
    val givenList= List(2,5,8,7,3,9,8,14,17,20)
    val List(lastElement, lastElementIndex) = findLastElementWithIndex(givenList)

    //print last element of the given list with its index value.
    println("Last Element:"+lastElement+"\nIndex of Last Element:"+lastElementIndex+"\n")
  }
}
