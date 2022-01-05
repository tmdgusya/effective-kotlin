package example03

fun main() {
  val user = User("roach")

  user.nickname
}

class User constructor(_nickname: String) {
  val nickname: String

  init {
    nickname = _nickname
  }
}