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


  class Animal
  class Dog extends Animal
  val aDog : Animal = new Dog //suntyping polymorphism

  trait Carnivore {
    def eat(a:Animal):Unit
  }

  class Corocodile extends Animal with  Carnivore{
    override def eat(a:Animal): Unit = println("crunch!")
  }

  //method notations
  val aCroc = new Corocodile
  aCroc.eat(aDog)
  aCroc eat aDog //natural language

  1 + 2
  println(1. + (2))

  //anonymous classes
  val aCarnovore = new Carnivore {
    override def eat(a: Animal): Unit = println("roar!")
  }
  println(aCarnovore.eat(aDog))

  //generics
  abstract class MyList[+A] //variance and variance problems
  object MyList //This and previous line are called companions

  //case classes
  case class Person(name:String, age:Int) // just regular classes which are immutable by default and decomposable through pattern matching, It uses equal method to compare instance structurally. It does not use new keyword to instantiate object. All the parameters listed in the case class are public and immutable by default

  //exceptions
  //val throwsException = throw new RuntimeException //The type for this expression is Nothing which is a type of Nothingness
  val aPotentialFailure = try{
    throw new RuntimeException
  }catch {
    case e:Exception => "I catch an exception"
  }finally {
    println("some logs")
  }

  //functional Programming
  val incrementer = new Function1[Int,Int]{
    override def apply(v1:Int) :Int = v1 + 1
  }

  println(incrementer(1))

  val anonymousIncrementer = (x:Int) => x +1 // lambdas
  println(anonymousIncrementer(2))
  List(1,2,3).map(anonymousIncrementer) // map is a Higher Order Function

  val pairs = for{
    num <- List(1,2,3)
    char <- List('a', 'b', 'c')
  } yield num + "_" + char
  println(pairs)




}
