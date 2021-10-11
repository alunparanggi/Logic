/*
Input: [3, 5, 2, -4, 8, 11]
penjumlahan = 7

Output: [[11, -4], [2, 5]]

note :
11, -4 dan 2, 5 adalah hasil penjumlahan 7
 */

fun main(){
    var result = findNumber(arrayListOf(1,2,3,4,5,-6,7,14), 8)
    print(result)
}

fun findNumber(listNumber: ArrayList<Int>, total: Int): ArrayList<ArrayList<Int>>{
    var numbers = ArrayList<ArrayList<Int>>()
    val maxIndex = listNumber.size -1
    for(i in 0..maxIndex){
        for(j in i..maxIndex){
            if(listNumber[i] + listNumber[j] == total){
                numbers.apply {
                    add(arrayListOf(listNumber[i], listNumber[j]))
                }
            }
        }
    }
    return numbers
}
