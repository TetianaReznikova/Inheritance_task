package app.view;

import java.util.Scanner;

public class View {

    Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        System.out.print("Enter the bet: ");
        String bet = scanner.nextLine().trim();
        System.out.print("Enter the win number: ");
        String winNum = scanner.nextLine().trim();
        return new String[]{bet, winNum};
    }

    public String getOption() {
        return scanner.nextLine().trim();
    }

    public void getOutput() {
        scanner.close();
        System.out.println(output);
    }
}
