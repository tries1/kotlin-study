package chapter1

import java.lang.IllegalArgumentException

fun showFirstCharacter(input: String): Char {
    if (input.isEmpty()) throw IllegalArgumentException()
    return input.first();
}