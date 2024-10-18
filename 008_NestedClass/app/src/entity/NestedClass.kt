package app.src.entity

class Primary {
    // Attr here -----------------------------------------

    // Method here ---------------------------------------
    fun greet() = println("Outer Class (Parent)")

    class Secondary {
        // Attr here -------------------------------------

        // Method here -----------------------------------
        fun greet() = println("Inner Class (Child)")
        
    }
}