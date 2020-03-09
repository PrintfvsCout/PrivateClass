package com.privateclass.privateClasses.api;

import com.privateclass.privateClasses.model.Profesor;
import com.privateclass.privateClasses.model.Telefon;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("views")
@RestController
public class ProfesorController
{
    private final JdbcTemplate jdbcTemplate;

    public ProfesorController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/profesorsql")
    public List<Profesor> getProfesor()
    {
        final String sql="SELECT id, id_odrzuvac, kvalifikacija FROM profesor";

        return jdbcTemplate.query(sql,(resultSet, i) ->
        {
            int id=Integer.parseInt(resultSet.getString("id"));
            int id_k=Integer.parseInt(resultSet.getString("id_odrzuvac"));
            String kvalifikacija = resultSet.getString("kvalifikacija");

            return new Profesor(id, id_k, kvalifikacija);
        });

    }

}
