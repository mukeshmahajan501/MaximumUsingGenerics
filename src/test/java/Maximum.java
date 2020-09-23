public class Maximum {

    Integer number1;
    Integer number2;
    Integer number3;

    public Maximum(Integer number1, Integer number2, Integer number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int getMaximumNumber() {
        Integer maxNumber = 0;

        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0) {
            maxNumber = number1;
        } else if (number2.compareTo(number3) > 0 && number2.compareTo(number1) > 0) {
            maxNumber = number2;
        } else {
            maxNumber = number3;
        }
        return maxNumber;
    }
}
