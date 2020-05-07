package logged.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsersOperation {
    private final static LocalDate today = LocalDate.of(2019, 12, 25);

    public void filterUsers() {
        User john = new User("john123@ukr.net", LocalDate.of(2019, 12, 12), "Epam");
        User andrew = new User("andrew123@gmail.com", LocalDate.of(2019, 12, 14), "Microsoft");
        User max = new User("max123@ukr.net", LocalDate.of(2019, 12, 16), "Nestle");
        User mark = new User("mark123@gmail.com", LocalDate.of(2019, 12, 18), "Google");

        List<User> userList = new ArrayList<>();
        userList.add(john);
        userList.add(andrew);
        userList.add(max);
        userList.add(mark);

        Map<String, List<String>> arr = userList.stream()
                .filter(user -> user.getLoginDate().equals(today.minusDays(7)))
                .collect(Collectors.groupingBy(User::getTeam, Collectors.mapping(User::getEmail, Collectors.toList())));

        System.out.println(arr);
    }
}
