package Library

data class Student(val id: Int, val name: String, val books: MutableList<Book>) {

    fun loanBook(book: Book) {
        books.add(book)
    }

    fun returnBook(book: Book) {
        books.remove(book)
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