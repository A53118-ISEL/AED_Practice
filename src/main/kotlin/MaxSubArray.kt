//Maximum SubArray Problem

//Triple - 1st Pos, 2nd Pos, Max Sum
data class Triple(val a: Int, val b: Int, val c: Int)

//Quadratic Solution
//T-O(n^2), E-O(n)
fun MaxSubArr2(arr: IntArray, left: Int, right: Int): Triple {
    var l: Int = left
    var r: Int = right
    //Assume que a melhor soma está no intervalo [left,left]
    var sum: Int = arr[l]
    var aux = 0
    for (i in left..right) {
        for (j in l+1..right){
            aux += arr[j]
            if(aux > sum) {
                l = i
                r = j
                sum = aux
            }
        }
    }
    return Triple(l, r, sum)
}

//Kadane's Algorithm
//Linear Solution
//T-O(n), E-O(n)
fun MaxSubArr(arr: Array<Int>, left: Int, right: Int): Triple {
    var l: Int = left
    var r: Int = right
    var sum: Int = arr[l]
    var aux = 0
    for (i in left..arr.size-1) {
        sum =
            if (sum)
    }
    return Triple(l, r, sum)
}

