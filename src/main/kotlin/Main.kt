import javax.naming.Name



class Professor(val FirstName : String, val LastName :String, val Telephone:Int, val cour:String, val FUllName1: String)

data class Student (val FirstName1: String, val LastName1: String,val courrr: String, val FUllName :String)
data class Course (val Name :String, val number_of_lectures:Int)




fun main() {
    val Co: Course = Course(Name = "Kotlin", number_of_lectures = 2)
    val Po: Professor = Professor(
        FirstName = "Ali",
        LastName = "Mohammed",
        Telephone = 12123344,
        cour = "Kotlin",
        FUllName1 = "Ali Mohammed"
    )

    val St: Student =
        Student(FirstName1 = "Zeyad", LastName1 = "ALtwalah", courrr = "KOTLIN", FUllName = "Zeyad Altwalah")
    println("Course name is ${Co.Name}, Course Number is ${Co.number_of_lectures}")
    println(
        "Professor name is ${Po.FirstName}-- Professor last name is ${Po.LastName} --Professor Tele num is ${Po.Telephone}" +
                "---Professor course is ${Po.cour} "
    )
    println("Student  name is ${St.FirstName1}--Student last name is ${St.LastName1}---Student course is ${St.courrr}")
    println("Professor full name is ${Po.FUllName1}")
    println("Student full name is ${St.FUllName}")


}






