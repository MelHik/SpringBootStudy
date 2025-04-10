package Study.SpringBootStudy.controller;

import Study.SpringBootStudy.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
            Student.builder().firstName("Ilya").email("mail@mail.ru").age(25).build(),
            Student.builder().firstName("Anna").email("mail124@mail.ru").age(5).build(),
            Student.builder().firstName("Ramis").email("mail5245321@mail.ru").age(10).build()
        );
    }
}
