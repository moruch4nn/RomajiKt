package dev.mr3n.romajikt

object RomajiConversion {
    private val repeatConsonantRegex = Regex("([bcdfghjklmpqrstvwxyz])\\1+")

    /**
     * @param ignoreCase falseの場合は小文字のみ変換/trueの場合はすべての文字を変換
     */
    fun romajiToKana(romaji: String, ignoreCase: Boolean): String {
        var result = if(ignoreCase) romaji.lowercase() else romaji
        repeatConsonantRegex.findAll(result).forEach { matchResult ->
            val value = matchResult.value
            result = result.replaceFirst(value, value.replace(value, "${"っ".repeat(value.length-1)}${value.last()}"))
        }
        RomajiTable.romajiToKanaMapping.forEach { (old, new) -> result = result.replace(old, new) }
        result = result.replace("n", "ん")
        return result
    }
}

fun main() {
    println(RomajiConversion.romajiToKana("atonannkakattenikutoutennhairuna", false))
}