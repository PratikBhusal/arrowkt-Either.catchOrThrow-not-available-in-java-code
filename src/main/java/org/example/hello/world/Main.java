package org.example.hello.world;

import arrow.core.Either;

public class Main {
    public static void main(String[] args) {
        var foo = Either.tryCatch(() -> {
            return 2;
        });
        System.out.println(foo);

        var bar = Either.tryCatch(() -> {
            throw new RuntimeException("Oops!");
        });
        System.out.println(bar);


        // Cannot get
        // `https://apidocs.arrow-kt.io/arrow-core/arrow.core/-either/-companion/catch-or-throw.html`
        // to work no matter what I try :(

        Either<RuntimeException, Integer> attempt1 = Either<RuntimeException, Integer>.catchOrThrow(() -> {
            return 2;
        });
        Either<RuntimeException, Integer> attempt2 = Either.<RuntimeException, Integer>catchOrThrow(() -> {
            return 2;
        });
        Either<RuntimeException, Integer> attempt3 = Either.catchOrThrow<RuntimeException, Integer>(() -> {
            return 2;
        });
        Either<RuntimeException, Integer> attempt4 = Either<RuntimeException, Integer>.<RuntimeException, Integer>catchOrThrow(() -> {
            return 2;
        });
        Either<RuntimeException, Integer> attempt5 = Either<RuntimeException, Integer>.catchOrThrow<RuntimeException, Integer>(() -> {
            return 2;
        });
        Either<RuntimeException, Integer> attempt6 = Either.<RuntimeException, Integer>catchOrThrow<RuntimeException, Integer>(() -> {
            return 2;
        });
        Either<RuntimeException, Integer> attempt7 = Either<RuntimeException, Integer>.<RuntimeException, Integer>catchOrThrow<RuntimeException, Integer>(() -> {
            return 2;
        });

        System.out.println("Hello World!");
        for (var arg : args) {
            System.out.println(arg);
        }
    }

    private Main() {}
}
