package com.Lab2;
import java.util.Scanner;

public class Test {

    public void Testing(){
        int mark=0;
        System.out.println("Це дуже легкий тест. Відповідай уважно!");
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Київ- столиця України? (так/ні)");
        String q2 = scanner.nextLine();
        System.out.println("2: "+q2);
        if (q2.equals("так")) { mark++;}

        System.out.println ("Введіть кількість сторін у трикутнику: ");
        int q1 = scanner.nextInt();
        System.out.println("1: "+q1);
        if (q1==3) { mark++;}
        scanner.nextLine();

        System.out.println ("Перекладіть англійською:<Я люблю тебе>");
        String q3 = scanner.nextLine();
        System.out.println("3: "+q3);
        if ( q3.equals("I love you")) { mark++;}

        System.out.println ("5/2 ");
        float q4 = scanner.nextFloat();
        System.out.println("4: "+ q4);
        if (q4==2.5) { mark++;}
        scanner.nextLine();

        System.out.println ("Чи був цей тест корисним?(так/ні) ");
        String q5 = scanner.nextLine();
        System.out.println("5: "+q5);
        if (q5.equals("ні")) { mark++;}
        System.out.println("Твій результат: "+ mark+"/5");


    }
}
