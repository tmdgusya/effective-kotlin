package example01

/**
 * 생성자 대신 정적 팩토리 메소드를 고려하라
 */
class Car(
    val price : Int,
    val tire : Tire
) {

    companion object {
        fun createCarWithJTire() : Car {
            return Car(1000, JTire())
        }

        fun createCarWithKTire() : Car {
            return Car(1000, KTire())
        }
    }


}