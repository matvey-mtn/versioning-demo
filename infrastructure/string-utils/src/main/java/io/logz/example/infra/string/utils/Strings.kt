package io.logz.example.infra.string.utils

import org.apache.commons.lang3.StringUtils

object Strings {
    fun concat(left: Any, right: Any): String {
        return "${strip(left)} ${strip(right)}"
    }

    private fun strip(obj: Any): String {
        return StringUtils.strip(obj.toString())
    }
}
