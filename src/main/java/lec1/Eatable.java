package lec1;

public interface Eatable {
    public static final String I_WANT_EAT = "I want eat";

    void eat();

    default void iWantEat() {
        System.out.println(I_WANT_EAT);
    }
}
