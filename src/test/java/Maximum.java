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

    public static <E extends Comparable<E>> void printMax() {
        System.out.println("Max Integer= " + testMaximumValue(6, 4, 5, 3));
        System.out.println("Max Float= " + testMaximumValue(6.1f, 4.2f, 5.3f, 2.1f));
        System.out.println("Max String= " + testMaximumValue("Apple", "Banana", "Mango", "Peach"));
    }

    public static void main(String[] args) {
        printMax();
    }
}