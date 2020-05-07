package logged.users;

import java.time.LocalDate;

class User {
    private String email;
    private LocalDate loginDate;
    private String team;

    String getEmail() {
        return email;
    }

    LocalDate getLoginDate() {
        return loginDate;
    }

    String getTeam() {
        return team;
    }

    User(String email, LocalDate loginDate, String team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }
}
