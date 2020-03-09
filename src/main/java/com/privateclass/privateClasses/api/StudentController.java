package com.privateclass.privateClasses.api;

import com.privateclass.privateClasses.model.Student;
import com.privateclass.privateClasses.model.Telefon;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("views")
@RestController
public class StudentController
{
    private final JdbcTemplate jdbcTemplate;

    public StudentController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/studentsql")
    public List<Student> getTelefon()
    {
        final String sql="SELECT id, id_odrzuvac, godina FROM student";

        return jdbcTemplate.query(sql,(resultSet, i) ->
        {
            int id=Integer.parseInt(resultSet.getString("id"));
            int id_k=Integer.parseInt(resultSet.getString("id_odrzuvac"));
            String godina = resultSet.getString("godina");

            return new Student(id, id_k, godina);
        });

    }

}
