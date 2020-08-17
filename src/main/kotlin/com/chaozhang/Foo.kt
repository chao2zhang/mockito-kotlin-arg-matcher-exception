package com.chaozhang

open class Foo {

    @JvmOverloads
    open fun foo(a: Int, b: Int = 0, c: Int = 0): Int {
        return a + b + c
    }
}