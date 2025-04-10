package Study.SpringBootStudy.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthday;
    @NonNull
    private String email;
    private int age;
}
