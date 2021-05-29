package lectures.part1as

object Recap extends App {

  val aCondition : Boolean = false
  val aConditionedVal = if(aCondition) 1 else 2
  //instructions vs expressions
  val aCodedBlock = {
    if(aCondition) 3
    4
  }
}
