fun main(){
    print(isPalindrome("madam"))
}

fun isPalindrome(text: String): Boolean{
    val textArray = text.toCharArray()
    val maxIndex = textArray.size-1
    for(i in 0..maxIndex){
        if(textArray[i] != textArray[maxIndex-i]){
            return false
        }
    }
    return true
}