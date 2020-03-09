package com.privateclass.privateClasses.api;

import com.privateclass.privateClasses.model.Casovi_po;
import com.privateclass.privateClasses.model.Izbira;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("views")
@RestController
public class CasoviPoController
{
    private final JdbcTemplate jdbcTemplate;

    public CasoviPoController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/casoviposql")
    public List<Casovi_po> getCasovi()
    {
        final String sql="SELECT id_casovi_po,id_odrzuvac,id_predmet,vremetraenje,lokacija FROM casovi_po";

        return jdbcTemplate.query(sql,(resultSet, i) ->
        {
            int id=Integer.parseInt(resultSet.getString("id_casovi_po"));
            int id_o=Integer.parseInt(resultSet.getString("id_odrzuvac"));
            int id_p=Integer.parseInt(resultSet.getString("id_predmet"));
            int vreme=Integer.parseInt(resultSet.getString("vremetraenje"));
            String lokacija=resultSet.getString("lokacija");

            return new Casovi_po(id,id_o,id_p,vreme,lokacija);
        });

    }

}
