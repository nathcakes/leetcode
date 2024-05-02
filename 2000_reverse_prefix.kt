fun reversePrefix(word: String, ch: Char): String {
    val reversed = StringBuilder();
    for (char in word){
        reversed.insert(0, char)
        if (char == ch){
            reversed.append(word.removeRange(0 ..word.indexOf(char)))
            return reversed.toString()
        } 
    }
    return word;
}