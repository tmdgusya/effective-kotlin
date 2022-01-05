package example04

val sum = { x: Int, y:Int -> x + y }

fun main() {
  println(sum(1, 2))


  run( { println(sum(1, 2)) } )

  /**
   * 람다를 괄호 밖으로 꺼내는 것이 가능하다.
   */
  run { println(sum(1, 2)) }
}