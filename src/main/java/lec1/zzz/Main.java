package lec1.zzz;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> n = List.of(1, 2, 3);
        int[] a=null;
        Integer[] b = null;
        Predicate p;
        List<Integer> collect = n.stream()
                .filter(new Predicate<Integer>() {
                    public boolean test(Integer i) {
                        boolean result= foo(i);
                        return result;
                    }
                })
                .filter(i->foo(i))
                .collect(Collectors.toList());

        //foo();
    }

    public static boolean foo (Integer i) {

        throw new RuntimeException();
    }

    public static boolean boo (Integer i) throws Exception {

        throw new Exception();
    }
}

class A{
    public A method() throws Throwable { // 1
        return new Single();
    }
}

class Single extends A{
    public Single method(String str) throws RuntimeException { // 2
        return new Single();
    }
    public Single method() throws IOException {  //3
        return new Double();
    }
}

class Double extends Single{
    public void method(Integer digit) throws ClassCastException {      // 4
    }

    @Override
    public Double method() throws IOException {  // 5
        return new Double();
    }
}

