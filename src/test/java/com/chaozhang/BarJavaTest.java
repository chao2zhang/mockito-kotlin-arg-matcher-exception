package com.chaozhang;

import org.junit.Test;
import org.mockito.Mockito;
import org.omg.CORBA.DynAnyPackage.Invalid;

import static org.mockito.ArgumentMatchers.eq;

public class BarJavaTest {

    @Test
    public void worksInKotlin1_3_72ButNotKotlin1_4_0() {
        Foo foo = Mockito.mock(Foo.class);
        new BarJava(foo).bar(42);
        Mockito.verify(foo).foo(42);
        Mockito.verify(foo).foo(eq(42), eq(0), eq(0));
        Mockito.verify(foo).foo(eq(42)); // Works in Kotlin 1.3.72, throws error in Kotlin 1.4.0
        // org.mockito.exceptions.misusing.InvalidUseOfMatchersException:
        // Invalid use of argument matchers!
        // 3 matchers expected, 1 recorded:
        // -> at com.chaozhang.BarJavaTest.worksInKotlin1_3_72ButNotKotlin1_4_0(BarJavaTest.java:17)
    }
}