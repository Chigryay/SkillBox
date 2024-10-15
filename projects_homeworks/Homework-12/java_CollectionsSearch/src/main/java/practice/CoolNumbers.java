package practice;

import java.util.*;

public class CoolNumbers {
    private static final Character[] WORD_FOR_REGISTRATION_NUMBER = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О',
                                                                    'Р', 'С', 'Т', 'У', 'Х'};

    public static List<String> generateCoolNumbers() {

        List<String> registrationNumber = new ArrayList<>();
        List<Character> rndChars = new ArrayList<>(Arrays.asList(WORD_FOR_REGISTRATION_NUMBER));
        for (int i = 0; i < 2_000_000; i++) {

            Collections.shuffle(rndChars);
            for (int j = 0; j < rndChars.size(); j++) {
                StringBuilder builder = new StringBuilder();
                String rndRegion = generateRegion();
                builder.append(generateChar(rndChars))
                        .append(generateNumber())
                        .append(generateNumber())
                        .append(generateNumber())
                        .append(generateChar(rndChars))
                        .append(generateChar(rndChars))
                        .append(rndRegion);

                registrationNumber.add(builder.toString());
            }
        }
        return registrationNumber;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        int index = Collections.binarySearch(sortedList, number);
        return sortedList.contains(sortedList.get(index));
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return false;
    }

    public static Character generateChar(List<Character> characters) {
        return characters.get((int) (Math.random() * characters.size()));
    }

    public static int generateNumber() {
        return (int) (Math.random() * 9);
    }

    public static String generateRegion() {
        int rndNumberRegion = (int) (Math.random() * 199);
        return rndNumberRegion <= 9 ?
                "0".concat(String.valueOf(rndNumberRegion)) :
                String.valueOf(rndNumberRegion);
    }

}
