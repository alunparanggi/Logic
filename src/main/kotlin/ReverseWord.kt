fun main(){
    reverseWords("I wanna drink a cup of coffee")
}

fun reverseWords(words: String){
    val arrayWords = words.split(" ")
    val arrayReversedWords = ArrayList<String>()
    var reversedWords = ""
    for(i in arrayWords.indices){
        arrayReversedWords.add(arrayWords[i].reversed())
        for (j in (arrayReversedWords.size-1)..i){
            reversedWords += "${arrayReversedWords[i]} "
        }
    }

    print(reversedWords)




}