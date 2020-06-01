import java.util.Scanner;

class ReadFromUser {

    private ReadFromUser() {
    }

    public static String getSeasonDescription(Scanner scanner) {
        System.out.println("Podaj nazwę pory roku:");
        return scanner.nextLine();
    }
}
