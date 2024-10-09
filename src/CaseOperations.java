public class CaseOperations {

    // Method to convert text to uppercase
    public static void makeUpper(String text) {
        System.out.println(text.toUpperCase());
    }

    // Method to convert text to title case
    public static String makeTitle(String text) {
        String[] words = text.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return titleCase.toString().trim();
    }
}

