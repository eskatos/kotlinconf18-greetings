package greetings

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class GreetingsTest {

    @Test
    fun test() =
            assertThat(
                    TypeSafelyBuiltApp.loadGreeting(),
                    equalTo("Hello, KotlinConf!")
            )
}
