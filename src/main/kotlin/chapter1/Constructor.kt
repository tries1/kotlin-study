package chapter1

class Constructor {
}

//class Person constructor(val name: String, val age: Int?)
class Person constructor(val name: String, val age: Int?) {
    init {
        require(name.isNotEmpty()) {"Invalid name argument"}
        if(age  != null) {
            require(age in 0..149) {"Invalid age argument"}
        }
    }
}

fun main() {
    // new 키워드를 사용하지않아도, 인스턴스를 생성할수있다. (new 사용하면 컴파일 에러발생)
    val person = Person("glenn", 20)
    print("person name : ${person.name}, age : ${person.age}")
}