package de.niklas.utils;

public class AssertUtils {
    public static void asserts(boolean bool) {
        asserts(bool, "Assert failed!");
    }

    public static void asserts(boolean bool, String onFail) {
        if (!bool) {
            Throwable throwable = new Throwable(onFail);
            throwable.printStackTrace();
        }
    }

    public static void assertNonNull(Object o) {
        assertNonNull(o, "A Object of class " + o.getClass().getSimpleName() + " is null.");
    }

    public static void assertNonNull(Object o, String onFail) {
        if (o == null) {
            Throwable throwable = new Throwable(onFail);
            throwable.printStackTrace();
        }
    }

    public static <T> T check(boolean check, T pass, T fail) {
        return check ? pass : fail;
    }
}
