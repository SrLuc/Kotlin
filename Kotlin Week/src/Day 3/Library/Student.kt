package Library

data class Student(val id: Int, val name: String, val books: MutableList<Book>) {

    fun loanBook(book: Book): Book {
        books.add(book)
        return book
    }

    fun returnBook(book: Book):Book {
        books.remove(book)
        return book
    }

    fun showLoanedBooks() {
        if (books.isEmpty()) {
            println("📭 Nenhum livro emprestado.")
        } else {
            println("📚 Loadned books of $name:")
            books.forEach {
                println("- [${it.id}] \"${it.title}\" by ${it.author}")
            }
            println("\n")
        }
    }

}