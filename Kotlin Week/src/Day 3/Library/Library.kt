package Library

class Library {

    private val books = mutableListOf<Book>()
    private val students = mutableListOf<Student>()

    fun addBook(book: Book){
        books.add(book)
    }

    fun addStudent(student: Student){
        students.add(student)
    }

    fun loanBookToStudent(book: Book, student: Student){
        student.loanBook(book)
        books.remove(book)
    }

    fun returnStudentBook(book: Book, student: Student){
        student.returnBook(book)
        books.add(book)
        println("✅ Book: \"${book.title}\" Has Returned by ${student.name}")
    }

    fun showAllbooks(){
        books.forEach { println("${it.title} | ${it.author} | ${it.available}") }
    }

    fun showAllStudents(){
        students.forEach { println("Student: ${it.name} | ${it.id}") }
    }
}