package Storage

data class Product(var id: Int, var name: String, var amount: Int)

object ProductManager {

    private var idCounter = 1
    private val productsList = mutableListOf<Product>()

    fun addProduct(name: String, amount: Int): String {
        val newProduct = Product(idCounter++, name, amount)
        productsList.add(newProduct)
        return "Product '${newProduct.name}' (id=${newProduct.id}) has been added to the list"
    }

    fun showAllProducts() {
        when {
            productsList.isEmpty() -> println("No products available")
            else -> productsList.forEach { println(it) }
        }
    }

    fun updateProduct(id: Int, name: String, amount: Int): String {
        val product = productsList.find { it.id == id }
        return when(product){
            null -> "Product '$id' not found"
            else -> {
                product.name = name
                product.amount = amount
                "Product $id updated successfully"
            }
        }
    }

    fun deleteProduct(id: Int): String {
        val removed = productsList.removeIf { it.id == id }
        return if (removed) "Product '$id' removed successfully" else "Product '$id' not found"
    }
}
