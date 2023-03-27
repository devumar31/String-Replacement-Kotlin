fun main() {
    val inputString = "api.bytewise.com/{path}/{student}/kotlin/{name}/{rollnumber}"
    val outputString = inputString.formatWithParams("Android", "Yes", "Umar", 25)
    println(outputString)
}

fun String.formatWithParams(vararg params: Any): String {
    var result = this
    for ((index, param) in params.withIndex()) {
        val key = "{$index}"
        result = result.replace(key, param.toString())
    }
    return result
}
