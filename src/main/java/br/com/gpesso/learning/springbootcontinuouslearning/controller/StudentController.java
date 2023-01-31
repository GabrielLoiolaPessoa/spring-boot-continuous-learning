package br.com.gpesso.learning.springbootcontinuouslearning.controller;

import br.com.gpesso.learning.springbootcontinuouslearning.domain.Student;
import br.com.gpesso.learning.springbootcontinuouslearning.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("students")
@Log4j2
public class StudentController {

    private DateUtil dateUtil;
    public StudentController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @GetMapping(path = "list")
    public List <Student> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Student("Student1"), new Student("Student2"));
    }
}
