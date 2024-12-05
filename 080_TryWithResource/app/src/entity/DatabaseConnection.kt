package app.src.entity

class DatabaseConnection : AutoCloseable {
    // Open database connection
    fun connect(){
        println("Starting database connection (i think)...")
    }

    // Implement close() dari AutoCollapsible
    override fun close(){
        println("Ending database connection (i think again :P)...")
    }

    // fun executeQuery()
    fun executeQuery(query: String):String {
        if (query == "SELECT * FROM users"){
            return "Data pengguna..."
        } else {
            throw RuntimeException("Invalid query. Please check your query :(")
        }
    }
}