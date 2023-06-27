package dev.mr3n.romajikt

object RomajiTable {
    val romajiToKanaMapping = mutableListOf(
        // あ行
        "a" to "あ",
        "i" to "い",
        "u" to "う", "whu" to "う", "wu" to "う",
        "e" to "え",
        "o" to "お",

        "la" to "ぁ", "xa" to "ぁ",
        "li" to "ぃ", "xi" to "ぃ",
        "lu" to "ぅ", "xu" to "ぅ",
        "le" to "ぇ", "xe" to "ぇ",
        "lo" to "ぉ", "xo" to "o",

        "wha" to "うぁ",
        "whi" to "うぃ", "wi" to "うぃ",
        "whe" to "うぇ", "we" to "うぇ",
        "who" to "うぉ",

        "va" to "ゔぁ",
        "vi" to "ゔぃ",
        "vu" to "ゔ",
        "vyu" to "ゔゅ",
        "ve" to "ゔぇ",
        "vo" to "ゔぉ",

        "ye" to "いぇ",

        // か行
        "ka" to "か", "ca" to "か",
        "ki" to "き",
        "ku" to "く", "cu" to "く",
        "ke" to "け",
        "ko" to "こ", "co" to "こ",

        "xka" to "ヵ",
        "xke" to "ヶ",

        "ga" to "が",
        "gi" to "ぎ",
        "gu" to "ぐ",
        "ge" to "げ",
        "go" to "ご",

        "kya" to "きゃ",
        "kyi" to "きぃ",
        "kyu" to "きゅ",
        "kye" to "きぇ",
        "kyo" to "きょ",

        "gya" to "ぎゃ",
        "gyi" to "ぎぃ",
        "gyu" to "ぎゅ",
        "gye" to "ぎぇ",
        "gyo" to "ぎょ",

        "qa" to "くぁ", "kwa" to "くぁ",
        "qi" to "くぃ", "kwi" to "くぃ",
        "qe" to "くぇ", "kwe" to "くぇ",
        "qo" to "くぉ", "kwo" to "くぉ",

        "gwa" to "ぐぁ",

        // さ行
        "sa" to "さ",
        "si" to "し", "shi" to "し", "ci" to "し",
        "su" to "す",
        "se" to "せ", "ce" to "せ",
        "so" to "そ",

        "za" to "ざ",
        "zi" to "じ", "ji" to "じ",
        "zu" to "ず",
        "ze" to "ぜ",
        "zo" to "ぞ",

        "sya" to "しゃ", "sha" to "しゃ",
        "syi" to "しぃ",
        "syu" to "しゅ", "shu" to "しゅ",
        "sye" to "しぇ",
        "syo" to "しょ", "sho" to "しょ",

        "jya" to "じゃ", "ja" to "じゃ",
        "jyi" to "じぃ",
        "jyu" to "じゅ", "ju" to "じゅ",
        "jye" to "じぇ", "je" to "じぇ",
        "jyo" to "じょ", "jo" to "じょ",

        // た行
        "ta" to "た",
        "ti" to "ち", "chi" to "ち",
        "tu" to "つ", "tsu" to "つ",
        "te" to "て",
        "to" to "と",
        "ltu" to "っ", "xtu" to "っ", "xtsu" to "っ",

        "da" to "だ",
        "di" to "ぢ",
        "du" to "づ",
        "de" to "で",
        "do" to "ど",

        "tya" to "ちゃ", "cha" to "ちゃ", "cya" to "ちゃ",
        "tyi" to "ちぃ",
        "tyu" to "ちゅ", "chu" to "ちゅ", "cyu" to "ちゅ",
        "tye" to "ちぇ", "che" to "ちぇ",
        "tyo" to "ちょ", "cho" to "ちょ", "cyo" to "ちょ",

        "twa" to "とぁ",
        "twi" to "とぃ",
        "twu" to "とぅ",
        "twe" to "とぇ",
        "two" to "とぉ",

        "tsa" to "つぁ",
        "tse" to "つぇ",
        "tso" to "つぉ",

        "thi" to "てぃ",

        "thu" to "てゅ",


        "dya" to "ぢゃ",
        "dyi" to "ぢぃ",
        "dyu" to "ぢゅ",
        "dye" to "ぢぇ",
        "dyo" to "ぢょ",

        "dha" to "でゃ",
        "dhi" to "でぃ",
        "dhu" to "でゅ",
        "dhe" to "でぇ",
        "dho" to "でょ",

        "dwa" to "どぁ",
        "dwi" to "どぃ",
        "dwu" to "どぅ",
        "dwe" to "どぇ",
        "dwo" to "どぉ",

        // な行
        "na" to "な",
        "ni" to "に",
        "nu" to "ぬ",
        "ne" to "ね",
        "no" to "の",

        "nya" to "にゃ",
        "nyi" to "にぃ",
        "nyu" to "にゅ",
        "nye" to "にぇ",
        "nyo" to "にょ",

        // は行
        "ha" to "は",
        "hi" to "ひ",
        "hu" to "ふ", "fu" to "ふ",
        "he" to "へ",
        "ho" to "ほ",

        "ba" to "ば",
        "bi" to "び",
        "bu" to "ぶ",
        "be" to "べ",
        "bo" to "ぼ",

        "pa" to "ぱ",
        "pi" to "ぴ",
        "pu" to "ぷ",
        "pe" to "ぺ",
        "po" to "ぽ",

        "hya" to "ひゃ",
        "hyi" to "ひぃ",
        "hyu" to "ひゅ",
        "hye" to "ひぇ",
        "hyo" to "ひょ",

        "fa" to "ふぁ", "hwa" to "ふぁ",
        "fi" to "ふぃ", "hwi" to "ふぃ",
        "fyu" to "ふゅ", "hwyu" to "ふゅ",
        "fe" to "ふぇ", "hwe" to "ふぇ",
        "fo" to "ふぉ", "hwo" to "ふぉ",

        "bya" to "びゃ",
        "byi" to "びぃ",
        "byu" to "びゅ",
        "bye" to "びぇ",
        "byo" to "びょ",

        "pya" to "ぴゃ",
        "pyi" to "ぴぃ",
        "pyu" to "ぴゅ",
        "pye" to "ぴぇ",
        "pyo" to "ぴょ",

        // ま行
        "ma" to "ま",
        "mi" to "み",
        "mu" to "む",
        "me" to "め",
        "mo" to "も",

        "mya" to "みゃ",
        "myi" to "みぃ",
        "myu" to "みゅ",
        "mye" to "みぇ",
        "myo" to "みょ",

        // や行
        "ya" to "や",
        "yu" to "ゆ",
        "yo" to "よ",

        "lya" to "ゃ", "xya" to "ゃ",
        "lyu" to "ゅ", "xyu" to "ゅ",
        "lyo" to "ょ", "xyo" to "ょ",

        // ら行
        "ra" to "ら",
        "ri" to "り",
        "ru" to "る",
        "re" to "れ",
        "ro" to "ろ",

        "rya" to "りゃ",
        "ryi" to "りぃ",
        "ryu" to "りゅ",
        "rye" to "りぇ",
        "ryo" to "りょ",

        "wa" to "わ",
        "wo" to "を",

        "xwa" to "ゎ",

        "0" to "０",
        "1" to "１",
        "2" to "２",
        "3" to "３",
        "4" to "４",
        "5" to "５",
        "6" to "６",
        "7" to "７",
        "8" to "８",
        "9" to "９",

        "!" to "！",
        "\"" to "”",
        "#" to "＃",
        "$" to "＄",
        "%" to "％",
        "&" to "＆",
        "'" to "’",
        "(" to "（",
        ")" to "）",
        "=" to "＝",
        "-" to "ー",
        "^" to "＾",
        "~" to "〜",
        "¥" to "￥",
        "|" to "｜",
        "@" to "＠",
        "`" to "｀",
        "[" to "「",
        "{" to "｛",
        ";" to "；",
        "+" to "＋",
        ":" to "：",
        "*" to "＊",
        "]" to "」",
        "}" to "｝",
        "," to "、",
        "<" to "＜",
        "." to "。",
        ">" to "＞",
        "/" to "／",
        "?" to "？",
        "_" to "＿"
    ).sortedBy { it.first.length }.reversed()
}