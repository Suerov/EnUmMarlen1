
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, -7, 0, -5, 8, 0};
        String formattedNumbers = formatNumbers(numbers);
        System.out.println(formattedNumbers);
    }



    public static String formatNumbers(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        for (int formatNumbers : numbers) {
            if (formatNumbers > 0)
                sb.append("[").append(formatNumbers).append("]");
            else if (formatNumbers < 0) {
                sb.append("{").append(formatNumbers).append("}");

            }else
                sb.append("zero");



        }
        return sb.toString();

    }
}