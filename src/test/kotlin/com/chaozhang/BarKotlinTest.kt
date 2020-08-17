package com.chaozhang

import org.junit.Test
import org.mockito.ArgumentMatchers.eq
import org.mockito.Mockito

class BarKotlinTest {

    @Test
    fun doesNotWorkInKotlin() {
        val foo: Foo = Mockito.mock(Foo::class.java)
        BarKotlin(foo).bar(42)
        Mockito.verify(foo).foo(42)
        Mockito.verify(foo).foo(eq(42), eq(0), eq(0))
        Mockito.verify(foo).foo(eq(42)) // This throws error in either Kotlin 1.3.72 or Kotlin 1.4.0
        // Invalid use of argument matchers!
        // 3 matchers expected, 1 recorded:
        // -> at com.chaozhang.BarKotlinTest.doesNotWorkInKotlin(BarKotlinTest.kt:15)
    }
}