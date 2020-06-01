import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String userInput = ReadFromUser.getSeasonDescription(scanner);
            Season season = Season.fromDescription(userInput.toUpperCase());
            season.printSeasonInfo();

        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }
}
