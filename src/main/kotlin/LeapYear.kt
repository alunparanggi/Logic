fun main(){
    printLeapYear(1500, 1600)
}

fun printLeapYear(startYear: Int, endYear: Int){
    if(startYear >= endYear){
        println("start year should be less than end year")
    } else {
        val arrayOfLeapYear = ArrayList<Int>()
        var stringArrayOfLeapYear = ""
        for (i in startYear..endYear){
            if (i % 100 == 0) {
                if (i % 4 == 0) {
                    if(i % 400 == 0) {
                        arrayOfLeapYear.add(i)
                    }
                }
            } else if (i % 4 == 0){
                arrayOfLeapYear.add(i)
            }
        }
        stringArrayOfLeapYear = arrayOfLeapYear.joinToString {
            "$it"
        }
        print(stringArrayOfLeapYear)
    }
}