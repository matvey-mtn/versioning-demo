package io.logz.example.service.bar

import io.logz.example.infra.string.utils.Strings
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringsTest {

    @Test
    fun `concat multiple strings`() {
        val concat1 = Strings.concat("abc", "  def")
        val concat2 = Strings.concat(concat1, "ghi  ")
        Assertions.assertEquals("abc def ghi", concat2)
    }
}
