package practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {

  public static void main(String[] args) {
    String text = "Norman Gortsby was sitting on a bench hidden behind the bushes in Hyde Park. It was a warm May evening. The sun had already set and it was rather dark, but he could still make out the faces of the people who were walking past him and hear the sound of their voices. He was a philosopher, and liked sitting in the Park watching people whom he didn’t know. While he was wondering who they were and where they were going, a young man came up to the bench, gave a quick look at him and threw himself down by his side. The newcomer was well-dressed and looked like a gentleman. His face was sad and he sighed deeply.\n" +
            "«You don’t seem to be in a very good mood,» said Norman. The young man was silent. He only looked at Norman again and there was an expression in his eyes that Norman didn’t like.\n" +
            "«I really don’t know how it all happened.» he began at last, «but I’ve done the silliest thing that I’ve ever done in my life.» He spoke in a low voice, almost in a whisper.\n" +
            "«Yes» said Norman coldly.\n" +
            "«I came to London this afternoon,» the young man went on. «I had a meal at the hotel, sent a letter to my people, giving them the address and then went out to buy a piece of soap. They are supposed to give you soap at the hotel but it’s always so bad that I decided to buy some for myself. I bought it, had a drink at a bar, and looked at the shops. When I wanted to go back to the hotel, I suddenly realized that I didn’t remember its name or even what street it was in. Of course I can write to my people for the address, but they won’t get my letter till tomorrow. The only shilling I had on me when I came out was spent on the soap and the drink and here I am with two pence in my pocket and nowhere to go for the night.»\n" +
            "There was a pause after he told the story.\n" +
            "«I’m afraid you don’t believe me,» he added.\n" +
            "«Why not?» said Norman. «I did the same thing once in a foreign capital. So I can understand you very well.»\n" +
            "«I’m glad you do,» the young man said with a pleasant smile. «And now I must go. I hope by the time it gets quite dark I’ll have found a man who’ll believe me like you did, and will agree to lend me some money.»\n" +
            "«Of course,» said Norman slowly. «The weak point of your story is that you can’t produce the soap.»\n" +
            "The young man put his hand into his pocket and suddenly got up.\n" +
            "«I’ve lost it,» he said angrily.";

    System.out.println(splitTextIntoWords(text));
  }

  public static String splitTextIntoWords(String text) {

    StringBuilder builder = new StringBuilder();
    String regex ="[A-aZ-z]+";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      builder.append(matcher.group())
              .append(System.lineSeparator());
    }

    return builder.toString().strip();
  }

}