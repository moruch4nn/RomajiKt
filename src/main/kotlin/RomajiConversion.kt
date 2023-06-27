object RomajiConversion {
    private val repeatConsonantRegex = Regex("([bcdfghjklmpqrstvwxyz])\\1+")
    fun romajiToKana(romaji: String): String {
        var result = romaji
        repeatConsonantRegex.findAll(result).forEach { matchResult ->
            val value = matchResult.value.dropLast(1)
            result = result.replaceFirst(value, value.replace(value, "っ".repeat(value.length)))
        }
        RomajiTable.romajiToKanaMapping.forEach { (old, new) -> result = result.replace(old, new) }
        result = result.replace("n", "ん")
        return result
    }
}