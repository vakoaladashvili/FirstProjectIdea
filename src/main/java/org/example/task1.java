package org.example;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        // განსაზღვრავს კითხვას და სწორ პასუხს.
        String question = "რომელია ყველაზე გრძელი მდინარე მსოფლიოში ?";
        String correctAnswer = "ნილოსი";

        // იქმნება scanner ობიექთი, რომ წაიკითხოს მომხმარებლის input-ი.
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "";

        // აგრძელებს კითხვის დასმას, სანამ მომხმარებელი არ გასცემს სწორ პასუხს
        while (true) {
            System.out.println(question); // პრინტავს შეკითხვას
            userAnswer = scanner.nextLine(); // კითხულობს მომხმარებლის input-ს

            // ვამოწმებთ თუ პასუხი სწორია
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("სწორი პასუხია !");
                break; // გამოვდივართ loop-დან როდესაც პასუხი სწორია.
            } else {
                System.out.println("პასუხი არასწორია. სცადე ახლიდან!");
            }
        }

        // დავხუროთ scanner
        scanner.close();
    }
}
