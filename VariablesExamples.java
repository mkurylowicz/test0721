package FistSteps;

public class VariablesExamples {
    public static void main(String args[]){
        //typy zmiennych
        int number = 1;
        int number2 = 2;
        String name= "Zdzisław";
        boolean isTrue = true;

        System.out.println("Aplication beggining");
        System.out.println("Your number is " + number); //plus służy do łączenia stringów, tutaj wyjątkowo łaczymy zmienną numeryczną ze stringiem
        System.out.println("Hello " + name + " Your number is " + number);
        System.out.println(1+2);
        System.out.println(isTrue);
        //System.out.println("1" == 1); takiego porównania nie da się zrobić, porównanie dwóch różnych danych
        System.out.println(1 == 1);


        //Zakres widoczności zmiennej
        if(isTrue){
            String confirm = "Yes it is true";
            System.out.println(confirm);
        }
        //System.out.println(confirm);//tutaj zmienna confirm jest już niewidoczna jeżeli jest zadeklarowana wyżej

        String confirm1 = "Yes!!!";
        if(isTrue){
            String confirm = "Yes it is true";
            System.out.println(confirm);
        }
        System.out.println(confirm1);

        //operatory
        System.out.println(number++);

        System.out.println(++number);

        if (++number < 2){
            System.out.println("Lower than two");
        }
        if (--number < 2){
            System.out.println("Lower than two");
        }
        if (number++ < 2){
            System.out.println("Lower than two");
        }
        if (number-- < 2){
            System.out.println("Lower than two");
        }
        if (number-- < 2){
            System.out.println("Lower than two");
        }
        if (number < 2){
            System.out.println("Lower than two");
        }
        System.out.println(!isTrue);
        if (number-- < 2){
            System.out.println("Lower than two");
        }
        number += number2;//number=number+number2
        System.out.println(number);
    }
}
