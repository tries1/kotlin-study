package chapter1

class InnerClass {
    private val name = "InnerClass name!!!";

    inner class InnerClassA {
        fun foo() {
            print("InnerClass.name : ${this@InnerClass.name}")
        }
    }
}

fun main() {
    val innerClass = InnerClass();
    innerClass.InnerClassA().foo()
}