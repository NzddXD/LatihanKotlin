package app.src.entity

class Inspect(){
    fun inspect(obj : Any):String {
        return when (obj) {
            is String -> "'$obj' is string and have ${obj.length} characters"
            is Int -> "'$obj' is Integer"
            is Double -> "'$obj' is Double or Float"
            is Boolean -> "'$obj' is Boolean"
            else -> "Unknown object type"
        }
    }
}