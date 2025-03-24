fun less (x: Int, y: Int): Boolean = x < y
fun more (x: Int, y: Int): Boolean = x > y

fun exch(a: IntArray, x: Int, y: Int) {
    val aux = a[x]
    a[x] = a[y]
    a[y] = aux
}

fun lessExch(a: IntArray, i: Int, j: Int){
    if (less(a[i], a[j])) exch(a, i, j)
}
fun moreExch(a: IntArray, i: Int, j: Int){
    if (more(a[i], a[j])) exch(a, i, j)
}