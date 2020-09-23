public class Maximum {

    String str1;
    String str2;
    String str3;

    public Maximum(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    public String getMaximumString() {
        String maxString =str1 ;

        if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) {
            maxString = str1;
        } else if (str2.compareTo(str3) > 0 && str2.compareTo(str1) > 0) {
            maxString = str2;
        } else {
            maxString = str3;
        }
        return maxString;
    }
}
