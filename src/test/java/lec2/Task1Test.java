package lec2;

import org.junit.*;

public class Task1Test {

    @Test(expected = NullPointerException.class)
    public void rise_npe() {
        Task1.npe();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void rise_index_out_of_bounds() {
        Task1.aioobe();
    }

    @Test(expected = RuntimeException.class)
    public void rise_custome_exeption() {
        Task1.myThrow();
    }


}
