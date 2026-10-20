// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String,Double>

fun fetchData(filename: String):List<Record> = buildList {
    val store = mutableListOf<Record>()
    Path(filename).forEachLine { line ->
        val parts = line.split(",")
        store.add(Record(parts[0], parts[1].toDouble()))
    }
    return store
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
