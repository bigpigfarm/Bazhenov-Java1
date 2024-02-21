//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numberEnter = new Scanner(System.in);
        Scanner actionEnter = new Scanner(System.in);
        double result;

        System.out.println("Введите первое число: ");
        int one = numberEnter.nextInt();
        System.out.println("Введите второе число: ");
        int two = numberEnter.nextInt();
        System.out.println("Выберите действие \n+ для сложения\n - для вычитания\n/ для деления\n* для умножения\n? для сравнения");
        String action = actionEnter.nextLine();

        switch (action) {
            case "+":
                result = one + two;
                System.out.println(one + " + "+ two + " = "+ result);;
            break;
            case "-":
                result = one - two;
                System.out.println(one + " - "+ two + " = "+ result);;
                break;
            case "*":
                result = one * two;
                System.out.println(one + " * "+ two + " = "+ result);;
                break;
            case "/":
                result = one / two;
                System.out.println(one + " / "+ two + " = "+ result);;
                break;
            case "?":
                if (one > two){
                System.out.println(one + " > "+ two);}
                else if (one < two){
                    System.out.println(one+" < " +two);
                }else if (one==two){
                    System.out.println(one+" = "+two);
                };
                break;

            default:
                System.out.println("Ошибка");;
            break;

        }
    }
}