import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        TestTask testTask = new TestTask();

        System.out.println("Hi!\n Choose the algorithm you want to check:\n" +
                " 1 - check the input number > '7';\n" +
                " 2 - check the username is 'Вячеслав';\n" +
                " 3 - check the array elements select");
        Scanner  algorithm = new Scanner(System.in);
        int task = algorithm.nextInt();


        switch (task){

            case 1:
                //TASK #1
                try {
                    testTask.task_1();
                } catch  (Exception errorNumber){
                    System.out.println("Enter only number data!");
                    testTask.task_1();
                }
                main(args);
                break;

            case 2:
                //TASK #2
                testTask.task_2();
                main(args);
                break;

            case 3:
                //TASK #3
                try {
                    testTask.task_3();
                } catch  (Exception errorNumber){
                    System.out.println("Enter only number data!");
                    testTask.task_3();
                }
                main(args);
                break;

            default:
                System.out.println("Error algorithm number.");
                break;
        }
    }
}