package chapter1

data class Customer(val id: Int, val name: String, var address: String)

fun main() {
    val customer = Customer(1, "glenn", "seoul")
    println("customer id : ${customer.id}")
    println("customer name : ${customer.name}")
    println("customer address : ${customer.address}")
}