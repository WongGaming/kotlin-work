// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count { it.status == ItemStatus.NotStarted }
    val inProgress get() = items.count { it.status == ItemStatus.InProgress }
    val done get() = items.count { it.status == ItemStatus.Done }
    val overdue get() = items.count {it.dueDate < today() && it.status != ItemStatus.Done}

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        //2026-10-16: NotStarted: Go shopping for food
        Path(filename).forEachLine() 
        {
            val parts = it.split(":")
            if (parts.size == 3) 
            {
                val dueDate = LocalDate.parse(parts[0].trim())
                val status = ItemStatus.valueOf(parts[1].trim())
                val description = parts[2].trim()
                items.add(ToDoItem(dueDate, status, description))
            }
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        return items.removeAll { it.status == ItemStatus.Done }
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        var result = mutableListOf<ToDoItem>()
        if (status == null) 
        {
            result = items
        } 
        else 
        {
            for (item in items) 
            {
                if (item.status == status) 
                {
                    result.add(item)
                }
            }
        }
        return result
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        var result = mutableListOf<ToDoItem>()
        for (item in items) 
        {
            if (item.dueDate == date) 
            {
                result.add(item)
            }
        }
        return result
    }
}
