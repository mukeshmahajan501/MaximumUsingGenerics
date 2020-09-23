public class Maximum<E extends Comparable<E>> {

    E[] numbers;

    public Maximum(E... numbers) {
        this.numbers = numbers;
    }

    //Method to check maximum integer, float & string number between three.
    public static <E extends Comparable<E>> E testMaximumValue(E... numbers) {
        E maximumNumber = numbers[0];
        for (E element : numbers) {
            if (element.compareTo(maximumNumber) > 0) {
                maximumNumber = element;
            }
        }
        return maximumNumber;
    }
}