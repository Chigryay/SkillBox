package practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {

  public static void main(String[] args) {
    String text = "For almost any person, there is nothing more important in the world than their family." +
            " I love my family too. Today I would like to tell you about them.\n" +
            "\n" +
            "My family is quite big. It consists of my mother, father, my three siblings and our cat Bob." +
            " Well, most people would say that a pet is not a family member but no one in our family would agree" +
            " with that. We all love Bob and consider him a family member.\n" +
            "\n" +
            "My mother’s name is Anna, she is a teacher. She has been working in our local school for a long time." +
            " My mom teaches History and Social Studies, the subjects that I really love. She loves reading very much," +
            " and her favorite book is “A Street Cat Named Bob” by James Bowen." +
            " If you are familiar with the book, you can guess why she named our ginger cat Bob.\n" +
            "\n" +
            "My father’s name is Igor. He is a little older than mom and he used to be a police officer." +
            " He retired at a quite young age and has been running his own business ever since. He has a small coffee" +
            " shop and a candy store." +
            " To be honest, I don’t know much about his business, but he says it is doing well.\n" +
            "\n" +
            "As for my siblings, I have a sister, her name is Maria, and she is the oldest one," +
            " and two brothers – Viktor and Boris. By the way, I am the youngest child in the family but I am totally happy with that role." +
            " My sister Maria is an engineer, she lives in another town but visits us at least once a month." +
            " My brothers are still students. Viktor studies history, following in our mother’s footsteps," +
            " Boris is going to be a software developer. He is a big fan of videogames, and his dream is to develop his own game.\n" +
            "\n" +
            "In conclusion, I would like to say that " +
            "I love my family and for me there is nothing more important than them." +
            " I think, they all have the same opinion. Even Bob.";
    System.out.println(splitTextIntoWords(text));
  }

  public static String splitTextIntoWords(String text) {
    StringBuilder builder = new StringBuilder();
    String regex = "[A-Za-z]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      builder.append(matcher.group()).append('\n');
    }

    return builder.toString().trim();
  }

}