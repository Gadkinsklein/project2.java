import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        try {
        ArrayList<Task> myList = new ArrayList<>();
        System.out.println("1. Add a Task");
        System.out.println("2. Remove a Task");
        System.out.println("3. Update a Task");
        System.out.println("4. List all Tasks");
        System.out.println("0. Exit");
        System.out.println("What would you like to do? ");
        int userInput = input.nextInt();
        input.nextLine();

    while (userInput > 0) {
        if (userInput == 1)
            addTask(myList);
        else if (userInput == 0)
            System.exit(0);
        else if (userInput == 2) {
            removeTask(myList);
            System.out.println(myList);

        } else if (userInput == 4) {
            System.out.println("Here are your current Tasks");
            System.out.println(myList);

        } else if (userInput == 3) {
            updateTask(myList);
            System.out.println(myList);
        }


        System.out.println("What would you like to do? ");
        userInput = input.nextInt();
        input.nextLine();
    }
}catch(Exception e){
    System.out.println("Something went wrong");
}

    }


static ArrayList<Task> addTask(ArrayList<Task> a)
    {
        System.out.println("What is the title of the task?...");

        String title = input.nextLine();

        System.out.println("Description of the Task");
        String desc = input.nextLine();

        System.out.println("What is the Priority of the Task? ");

        int prio = input.nextInt();

        Task aNewTask = new Task(title, desc, prio);

        a.add(aNewTask);




        return a;

    }


    static ArrayList<Task> removeTask(ArrayList<Task> a) {
        System.out.println("What index would you like to remove:");
        String task = input.nextLine();
        a.remove(Integer.parseInt(task));
        return a;
    }

    static ArrayList<Task> updateTask(ArrayList<Task> a) {
        System.out.println("What task would you like to update?");
        int update = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a title for the task:");
        String title = input.nextLine();

        System.out.println("Please enter a description for the task");
        String desc = input.nextLine();

        System.out.println("Please enter a priority for the task:");
        int priority = input.nextInt();

        Task aNewTask = new Task(title, desc, priority);

        a.set(update, aNewTask);
        return a;
    }

    static void listTask(ArrayList<Task> a) {
        System.out.println("Here are the tasks you already have!");
        String userin = input.next();
    }

}



