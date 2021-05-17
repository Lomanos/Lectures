package lec1.zzz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class gfkuglug {

    public void foot() throws IOException {
        FileOutputStream fff=null;

        try {
            String str = new String();
            boolean n = str.equals("jygukgyuk");
            File delete = new File(str);
            fff = new FileOutputStream(delete);
        } catch (SecurityException | IOException m ) {
            System.out.println("IOE");
        } catch (Exception n) {
            System.out.println("Excep");
        }finally {
            if (fff != null) {
                try {
                    fff.close();
                } catch (IOException b) {
                    System.out.println("big fail exception!!! help me, plz :(");
                }
            }
        }


    }
}
