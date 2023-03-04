import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TestTask {


    public TestTask() {
    }

    void task_1(){
        System.out.println("Enter a number: ");
        Scanner variable = new Scanner(System.in);

        if (variable.nextDouble() > 7) {
            System.out.println("Привет! ");
        } else {
            System.out.println("Error number.");
        }
    }

    void task_2(){
        System.out.println("Enter user name: ");
        Scanner  userName = new Scanner(System.in);
        if(userName.nextLine().toLowerCase(Locale.ROOT).equals("вячеслав")){
            System.out.println("Привет, Вячеслав! ");
        }
        else {
            System.out.println("Нет такого имени.");
            task_2();
        }
    }

    void task_3(){
        ArrayList<Double> numberToThree = new ArrayList<>();
        System.out.println("Enter elements of array, for example: 1 12 33 4 5 ...\n" +
                "Press the 'Enter' to stop entering the array`s elements.\n");
        Scanner  userArray = new Scanner(System.in);
        String arrayNumber = userArray.nextLine();

        double [] array = new double[ arrayNumber.split(" ").length];
        System.out.println("The entered array:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(arrayNumber.split(" ")[i]);
            if(array[i] % 3 == 0){
                numberToThree.add(array[i]);
            }
            System.out.println(array[i]);
        }

        System.out.println("Array elements are multiples of three:\n" + numberToThree);

    }
}
