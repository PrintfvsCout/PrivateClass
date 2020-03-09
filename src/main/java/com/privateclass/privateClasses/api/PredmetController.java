package com.privateclass.privateClasses.api;

import com.privateclass.privateClasses.model.Predmet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/views")
@RestController
public class PredmetController
{
    private final JdbcTemplate jdbcTemplate;

    public PredmetController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/predmetisql")
    public List<Predmet> getPredmet()
    {
        final String sql="SELECT id,ime,nasoka,preduslov FROM predmet";

       return jdbcTemplate.query(sql,(resultSet, i) ->
        {
            int id=Integer.parseInt(resultSet.getString("id"));
            String ime=resultSet.getString("ime");
            String nasoka=resultSet.getString("nasoka");
            String preduslov=resultSet.getString("preduslov");

            return new Predmet(id,ime,nasoka,preduslov);
        });

    }
}
