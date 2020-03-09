package com.privateclass.privateClasses.api;

import com.privateclass.privateClasses.model.Izbira;
import com.privateclass.privateClasses.model.Telefon;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("views")
@RestController
public class TelefonController
{
    private final JdbcTemplate jdbcTemplate;

    public TelefonController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/telefonsql")
    public List<Telefon> getTelefon()
    {
        final String sql="SELECT id_telefon, id_odrzuvac, telefon FROM telefon";

        return jdbcTemplate.query(sql,(resultSet, i) ->
        {
            int id=Integer.parseInt(resultSet.getString("id_telefon"));
            int id_k=Integer.parseInt(resultSet.getString("id_odrzuvac"));
            String telefon = resultSet.getString("telefon");

            return new Telefon(id, id_k, telefon);
        });

    }

}
