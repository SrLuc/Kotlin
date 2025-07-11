package Library.test
import Library.Student
import Library.Book
import org.junit.Test
import org.junit.Assert.*

class StudentTest {

    @Test
    fun shouldLoanBook() {
        val student = Student(1, "Alice", mutableListOf())
        val book = Book(1, "1984", "George Orwell", true)

        student.loanBook(book)

        assertTrue(student.books.contains(book))
    }

    @Test
    fun shouldNotLoanBook() {
    val student = Student(1,"Alice", books = mutableListOf())
    val book = Book(1, "1984", "George Orwell", false)

    student.loanBook(book)
        assertTrue(student.books.contains(book))
    }

    @Test
    fun shouldReturnBook(){
        val book = Book(1, "1984", "George Orwell", true)
        val student = Student(1,"Alice", books = mutableListOf(book))

        student.returnBook(book)

        assertFalse(student.books.contains(book))
        assertTrue(student.books.isEmpty())

    }
}