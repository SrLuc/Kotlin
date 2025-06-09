package Library

fun main(){
    val book1 = Book(1, "Lords of Ring", "RR Martin", true)
    val book2 = Book(2, "Harry Potter", "Jk Rowling", true)
    val book3 = Book(3, "Da Vinci Code", "Brian May", true)

    val library = Library()
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    println("\nShowing All Books")
    library.showAllbooks()
    println("---------------------------------------")

    val student1 = Student(1, "John", mutableListOf(book1, book2))
    val student2 = Student(2, "Jane", mutableListOf(book3))

    library.addStudent(student1)
    library.addStudent(student2)

    println("\nShowing All Students")
    library.showAllStudents()
    println("---------------------------------------")

    library.loanBookToStudent(book3,student1)
    library.loanBookToStudent(book1,student2)
    library.loanBookToStudent(book2,student2)

    println("\nShowing All Loadned books Students")
    student1.showLoanedBooks()
    student2.showLoanedBooks()
    println("---------------------------------------")

    library.returnStudentBook(book1,student1)
    library.returnStudentBook(book2,student2)
    library.returnStudentBook(book3,student2)
    println("\nShowing All Loadned books Students")
    student1.showLoanedBooks()
    student2.showLoanedBooks()
    println("---------------------------------------")


}