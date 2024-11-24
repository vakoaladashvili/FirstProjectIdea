package org.example;

public class java_II_Lecture {
    public static void main(String[] args) {

      /*თუ მომხმარებლის ასაკი არის 6-18 ჩათვლით,
        შეუძლია აიღოს სკოლის მოსწავლის ბარათი.*/

        /*int currentAge = 25;*/

        /*if (currentAge > 6 && currentAge <= 18)
        {
            System.out.println("შეგიძლია აიღო სკოლის მოსწავლის ბარათი");
        }
        *//*თუ მომხმარებელის ასაკი არის 19 - 24 ჩათვლით, შეუძლია
            აიღოს სტუდენტის ბარათი.*//*
        else if (currentAge >= 19 && currentAge <= 24)
        {
            System.out.println("შეგიძლია აიღო სტუდენტური ბარათი");
        }
        *//*თუ მომხმარებელი არის 25-64 ის ჩათვლით, შეუძლია აიღოს
        ბიზნეს ბარათი*//*
        else if (currentAge >= 25 && currentAge <= 64)
        {
            System.out.println("შეგიძლია აიღო ბიზნეს ბარათი");
        }
        *//*თუ მომხმარებელი არის 64 წელს ზევით,
        შეუძლია აიღოს საპენსიო ბარათი        *//*
        else if (currentAge > 64)
        {
            System.out.println("შეგიძლია აიღო საპენსიო ბარათი");
        }
        *//*თუ მომხმარებელი არის 6 წელზე ნააკლები ასაკის,
        მაშინ ვერ აიღებს ბარათს*//*
        else
        {
            System.out.println("არ შეგიძლია ბარათის აღება");
        }*/

        int currentscore = 95;

        if (currentscore < 70){
            System.out.println("არ გადაეცემა");
        }
        else if (currentscore >= 90){
            System.out.println("A");
        }
        else if (currentscore >= 80){
            System.out.println("B");
        }
        else if (currentscore >= 70){
            System.out.println("C");
        }
    }
}
