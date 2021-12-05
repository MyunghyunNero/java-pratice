package subway;

import subway.utils.game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        new game(scanner).initialize();
    }
}
