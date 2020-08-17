package com.chaozhang

class BarKotlin(private val foo: Foo) {
    fun bar(command: Int) = if (command > 0) { foo.foo(command) } else { -1 }
}