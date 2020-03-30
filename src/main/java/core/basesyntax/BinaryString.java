package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder binaryNumber = new StringBuilder();
        for (int digitalNumber = value; digitalNumber > 0; digitalNumber /= 2) {
            binaryNumber.append(digitalNumber % 2);
        }
        return binaryNumber.reverse().toString();
    }
}
