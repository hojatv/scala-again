package lectures.part1as

import scala.annotation.tailrec

object Recap extends App {

  val aCondition: Boolean = false
  val aConditionedVal = if (aCondition) 1 else 2
  //instructions vs expressions
  val aCodedBlock = {
    if (aCondition) 3
    4
  }

  //Unit = void
  val theUnit = println("something!")

  //functions
  def aFunction(x: Int): Int = x + 1

  println(aFunction(4))

  //recursion: stack and tail
  @tailrec def factorial(n: Int, accumulator: Int): Int =
    if (n <= 0) accumulator
    else factorial(n - 1, n * accumulator)

  println(factorial(4, 1))

}
