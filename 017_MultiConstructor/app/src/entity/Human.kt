package app.src.entity

// Attr here -----------------------------------------

// ---------------------------------------------------

class Orang{
    // Member Vars
    var name : String
    var age : Int
    var job : String
    var salary : Int

    init {
        this.name = ""
        this.age = 0
        this.job = ""
        this.salary = 0
    }

    // First Secondary Constructor
    constructor (_name : String, _age : Int, _job : String){
        this.name = _name
        this.age = _age
        this.job = _job

        print("Name: $name |")
        print(" Age: $age |")
        print(" Job: $job |")
        println("")
    }
    // 2nd Constructor
    constructor (_name : String, _age : Int, _job : String, _salary : Int){
        this.name = _name
        this.age = _age
        this.job = _job
        this.salary = _salary

        print("Name: $name |")
        print(" Age: $age |")
        print(" Job: $job |")
        print(" Salary: $salary |")
        println("")
    }

}