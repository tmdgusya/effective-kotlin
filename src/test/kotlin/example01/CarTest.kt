package example01

import isEqualType
import isNotEqualType
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CarTest {

    @Test
    @DisplayName("JTire Factory Method 를 이용해 정상적으로 JTire 가 공급되는지 확인합니다.")
    fun createCarWithJTire() {
        //given
        val jTire = JTire()
        val kTire = KTire()

        //when
        val createCarWithJTire = Car.createCarWithJTire();

        //then
        isEqualType(jTire, createCarWithJTire.tire)
        isNotEqualType(kTire, createCarWithJTire.tire)
    }

}