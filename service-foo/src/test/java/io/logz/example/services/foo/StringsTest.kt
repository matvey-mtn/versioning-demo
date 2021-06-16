package io.logz.example.services.foo

import io.logz.example.infra.string.utils.Strings
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringsTest {

    @Test
    fun `concat foo and bar`() {
        Assertions.assertEquals(
             "foo bar", Strings.concat("foo  ", "bar"), "String concat should return `foo bar`"
        )
    }
}
