package Package_Git;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.menu();
    }

    public void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            UserInfo userInfo = new UserInfo();
            List<UserInfo> userInfoList = new ArrayList<>();

            boolean isLoading = true;
            while (isLoading) {
                System.out.println(" ___________________________________");
                System.out.println("|   1 - User registration           |");
                System.out.println("|   2 - User login                  |");
                System.out.println("|   3 - User list                   |");
                System.out.println("|   4 - Exit                        |");
                System.out.println("|___________________________________|");

                String select = sc.nextLine();
                switch (select) {
                    case "1" -> registration(sc);
                    case "2" -> login(sc);
                    case "3" -> getUserList();
                    case "4" -> isLoading = false;
                    default -> System.out.println("Please select menu item");
                }

            }
        }
    }
    public void registration(Scanner scanner){

    }
    public void login(Scanner scanner){

    }
    public void getUserList(){

    }
}