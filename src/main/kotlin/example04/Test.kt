package example04

fun findTheOldest(people: List<Person>) {
  var maxAge = 0
  var theOldest: Person? = null
  for (person in people) {
    if (person.age > maxAge) {
      maxAge = person.age
      theOldest = person
    }
  }
  println(theOldest)
}

fun easyWithLambda(people: List<Person>) {
  val theOldestPerson = people.maxByOrNull { it.age }
  println(theOldestPerson)
}

fun main() {
  val people = listOf<Person>(Person("Alice", 29), Person("Bob", 31))
  findTheOldest(people)
  easyWithLambda(people)
}