package com.chaozhang;

import org.jetbrains.annotations.NotNull;

public class BarJava {

    private Foo foo;

    public BarJava(@NotNull Foo foo) {
        this.foo = foo;
    }

    public int bar(int command) {
        if (command > 0) {
            return foo.foo(command);
        } else {
            return -1;
        }
    }
}
