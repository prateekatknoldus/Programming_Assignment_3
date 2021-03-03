package com.knoldus

// Implementation of Stack using List
class Stack{
  var list: List[Any] = List.empty
  var top: Int = -1 // top is a variable containing the position of top most or peek element of the stack

  // method to push an element into the stack
  def push(element:Any):Unit = {
    top = top + 1
    list = list ::: List(element)
  }

  // method to pop an element from the stack
  def pop(): Unit = {
    if (top == -1){
      println("Stack is Underflow")
    }
    else {
      list = list.dropRight(1)
      top = top - 1
    }
  }

  // method to check whether the stack is underflow or not
  def isEmpty:Boolean = {
    if (top == -1) true
    else false
  }

  // method to find the size of the stack
  def size:Int = list.length

  // method to find the top most or peek element of a stack
  def peek: Any = {
    if (top >= 0) list(top)
    else println("Stack is Underflow. Therefore, no peek element exist.")
  }

}

object StackTest
{
  def main(args: Array[String]): Unit = {
    val stack = new Stack()

    // pushing elements into the stack
    stack.push(10)
    stack.push(12)
    stack.push(13)
    stack.push(44)

    // popping element from the stack
    stack.pop()

    println("Position of top most element in the stack is "+stack.top)
    println(stack.isEmpty) // print true if the stack is empty. Otherwise, false
    println("The size of the stack is "+stack.size)
    println("The peek element of the stack is "+stack.peek)
  }
}
