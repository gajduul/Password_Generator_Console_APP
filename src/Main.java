import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;

        System.out.println("======Password Generator!======");
        System.out.println("The password will be 10 letters long: \n - upper case \n - lower case \n - numbers \n - special signs");
        while (true) {
            System.out.println("Options available:");
            System.out.println("1.Generate password \n2.Exit");
            System.out.print("Choose an option: ");
            try {
                choise = Integer.parseInt(scanner.nextLine());
                switch (choise) {
                    case 1 -> {
                        String password = Generator.generatePassword();
                        System.out.println("Your password is: " + password);
                        System.out.println("------------------------------------");

                        System.out.println("Do you want yo go to the menu? \n1.YES \n2.NO");
                        System.out.print("Choose an option: ");
                        int choiseGenerate = Integer.parseInt(scanner.nextLine());
                        switch (choiseGenerate) {
                            case 1:
                                System.out.println("------------------------------------");
                                break;
                            case 2:
                                System.out.println("Goodbye!");
                                System.exit(0);
                            default: {
                                System.out.println("Incorrect answer. Application will be killed");
                                System.exit(0);
                            }
                        }


                    }
                    case 2 -> {
                        System.out.println("Goodbye!");
                        System.exit(0);
                    }
                    default -> System.out.println("Incorrect answer! Try again");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect answer! Use numbers only!");
            }
        }
    }
}