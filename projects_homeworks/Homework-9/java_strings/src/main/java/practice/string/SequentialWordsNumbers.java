package practice.string;

public class SequentialWordsNumbers {

    public static void main(String[] args) {
        String text = "Это просто текст, для примера работы программы";
        System.out.println(sequentialWordsNumbers(text));
    }

    public static String sequentialWordsNumbers(String text){
        StringBuilder stringBuilder = new StringBuilder();

        String[] words = text.split(" ");
        int temp = 1;
        for (String word : words) {
            if (words[0].length() < 2)
                break;

            stringBuilder.append("(")
                    .append(temp)
                    .append(") ")
                    .append(word)
                    .append(" ");
            temp++;
        }
        return stringBuilder.toString().strip();
    }
}
