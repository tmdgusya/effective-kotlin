fun isEqualType(expected: Any, result: Any): Boolean {
    return result::class.isInstance(expected)
}

fun isNotEqualType(expected: Any, result: Any): Boolean {
    return !result::class.isInstance(expected)
}