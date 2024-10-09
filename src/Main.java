import java.util.Scanner;

public class Main {

    // Menu options
    private static final String MENU = """
            0. Exit
            1. Addition
            2. Subtraction
            3. Make Upper case
            4. Make Lower case
            """;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "";

        // Loop until the user chooses to exit
        while (!option.equals("0")) {
            System.out.println(MENU);
            System.out.print("Enter an option: ");
            option = scanner.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Bye");
                    break;
                case "1":
                    System.out.println("Addition selected\n");
                    break;
                case "2":
                    System.out.println("Subtraction selected\n");
                    break;
                case "3":
                    System.out.println("Make Upper case selected\n");
                    break;
                case "4":
                    System.out.println("Make Lower case selected\n");
                    break;
                default:
                    System.out.println("Wrong input\n");
                    break;
            }
        }
        scanner.close();
    }
}
