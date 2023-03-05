import java.lang.NumberFormatException

fun declarativeSum(list: List<String>): Int {
    return list
        .filter(::isValidNumber)
        .map(String::toInt)
        .sum()
}

fun isValidNumber(str: String): Boolean =
    try{
      str.toInt()
      true
    } catch (nfe: NumberFormatException){
         false
    }