//Fzr maxHeap e minHeap

data class Node(var left: Node?, var right: Node?)

//T-O(n*log_2(n)), E-O()
fun maxHeap(arr: IntArray, i: Int, n: Int): Int {
    var left = arr[i]
    var right = arr[arr.size - 1]
    var max = 0
    if (left <= n && arr[left] > arr[n]){
        max = left
    }
    else max = i
    if (right <= n && arr[right] > arr[n]){
        max = right
    }
    if (max != i) {
        exch(arr, arr[i], arr[max])
    }
    return maxHeap(arr, max, n)
}