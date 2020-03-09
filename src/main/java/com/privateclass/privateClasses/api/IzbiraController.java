package com.privateclass.privateClasses.api;

import com.privateclass.privateClasses.model.Izbira;
import com.privateclass.privateClasses.model.Predmet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("views")
@RestController
public class IzbiraController
{
    private final JdbcTemplate jdbcTemplate;

    public IzbiraController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/izbirasql")
    public List<Izbira> getIzbira()
    {
        final String sql="SELECT id_izbira,id_korisnik, id_predmet FROM izbira";

        return jdbcTemplate.query(sql,(resultSet, i) ->
        {
            int id=Integer.parseInt(resultSet.getString("id_izbira"));
            int id_k=Integer.parseInt(resultSet.getString("id_korisnik"));
            int id_p=Integer.parseInt(resultSet.getString("id_predmet"));


            return new Izbira(id,id_k,id_p);
        });

    }
}
