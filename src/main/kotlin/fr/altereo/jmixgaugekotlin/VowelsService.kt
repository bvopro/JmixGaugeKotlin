package fr.altereo.jmixgaugekotlin

class VowelsService {

    var vowels: HashSet<Char>? = HashSet()

    fun countVowels(word: String): Int {
        var count = 0
        for (ch in word.toCharArray()) {
            if (vowels!!.contains(ch)) {
                count++
            }
        }
        return count
    }
}
