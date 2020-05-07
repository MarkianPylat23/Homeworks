package runner.program;

import logged.users.UsersOperation;
import movies.MovieOperations;
import numbers.Calculation;

public class AppRunner {
    public void runProgram() {

        System.out.println("Task 1");
        new Calculation().operateNumbers();

        System.out.println("\n Task 2");
        new UsersOperation().filterUsers();

        System.out.println("\n Task 3");
        new MovieOperations().findAveragePriceByGenre();
    }
}
