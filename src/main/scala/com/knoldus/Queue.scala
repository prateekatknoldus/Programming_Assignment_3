package com.knoldus

// Implementation of Queue using List
class Queue {
  var list: List[Any] = List()
  var front: Int = -1 // front is a variable which contains the position of the element to be deleted
  var rear: Int = -1  // rear is a variable which contains the position of the newly inserted element

  // method to insert an element inside the queue
  def enqueue(element:Any): Unit = {
    if (front== -1 && rear == -1) {
      front = front + 1
      rear = rear + 1
      list = list ::: List(element)
    }
    else{
      rear = rear + 1
      list = list ::: List(element)
    }
  }

  // method to delete an element from the queue
  def dequeue(): Unit = {
    if (front== -1 && rear == -1){
      println("Queue is empty")
    }
    else if(front == rear){
      list = list.drop(1)
      front = -1
      rear = -1
    }
    else{
      list = list.drop(1)
      front = front + 1
    }
  }

  // method to check whether the queue is empty or not
  def isEmpty:Boolean ={
    if(front == -1 || rear == -1) true
    else false
  }

}

object QueueTest{
  def main(args: Array[String]): Unit = {
    val queue = new Queue()

    // inserting elements inside the queue
    queue.enqueue(10)
    queue.enqueue(15)
    queue.enqueue(3)
    queue.enqueue(6)


    // deleting elements from the queue
    queue.dequeue()
    queue.dequeue()

    queue.enqueue(22)

    println("Position of the element to be deleted is "+queue.front)
    println("Position of the newly inserted element is "+queue.rear)

    print(queue.isEmpty) // print true if the queue is empty. Otherwise, false

  }
}
