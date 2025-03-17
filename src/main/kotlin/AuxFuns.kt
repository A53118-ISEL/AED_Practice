fun less (x: Char, y: Char): Boolean = x < y
fun more (x: Char, y: Char): Boolean = x > y

fun exch(a: CharArray, x: Int, y: Int) {
    val aux = a[x]
    a[x] = a[y]
    a[y] = aux
}

fun lessExch(a: CharArray, i: Int, j: Int){
    if (less(a[i], a[j])) exch(a, i, j)
}
fun moreExch(a: CharArray, i: Int, j: Int){
    if (more(a[i], a[j])) exch(a, i, j)
}