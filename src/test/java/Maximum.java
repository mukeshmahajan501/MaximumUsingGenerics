public class Maximum {

    Float number1;
    Float number2;
    Float number3;

    public Maximum(Float number1, Float number2, Float number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public Float getMaximumFloatNumber() {
        Float maxNumber = 0.0f;

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
