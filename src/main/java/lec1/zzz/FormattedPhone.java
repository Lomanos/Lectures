package lec1.zzz;

public interface FormattedPhone {

    String getPhone();

    default String getFormattedPhone() {
        return getPhone();
    }
}
