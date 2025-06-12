package Storage

fun main() {

    println("\nSTORAGE SERVICE-")

    println(ProductManager.addProduct("Bike", 1))
    println(ProductManager.addProduct("Broken Boy", 4))
    println(ProductManager.addProduct("Ball", 5))
    println(ProductManager.addProduct("Bottle", 8))

    println("\n - ALL PRODUCTS AVAILABLE -")
    ProductManager.showAllProducts()

    println("\n - UPDATING PRODUCT AVAILABLE BY ID -")
    println(ProductManager.updateProduct(1, "Motorcycle", 1))

    println("\n - ALL PRODUCTS AVAILABLE AFTER UPDATE -")
    ProductManager.showAllProducts()

    println("\n - DELETING PRODUCT AVAILABLE BY ID -")
    println(ProductManager.deleteProduct(2))

    println("\n - ALL PRODUCTS AVAILABLE AFTER DELETE -")
    ProductManager.showAllProducts()

}