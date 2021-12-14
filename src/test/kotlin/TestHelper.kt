fun isEqualType(expected: Any, result: Any): Boolean {
    return result::class.isInstance(expected)
}