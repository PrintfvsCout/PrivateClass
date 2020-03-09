package com.privateclass.privateClasses.api;

import com.privateclass.privateClasses.dao.OdrzuvacDao;
import com.privateclass.privateClasses.model.Casovi_po;
import com.privateclass.privateClasses.model.Korisnik;
import com.privateclass.privateClasses.model.Odrzuvac;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@RequestMapping("views")
@RestController
public class OdrzuvacController
{

    private final JdbcTemplate jdbcTemplate;
    private OdrzuvacDao odrzuvacDao;

    public OdrzuvacController(JdbcTemplate jdbcTemplate, OdrzuvacDao odrzuvacDao) {
        this.jdbcTemplate = jdbcTemplate;
        this.odrzuvacDao = odrzuvacDao;
    }

    @GetMapping("/odrzuvaci")
    public List<Odrzuvac> getAllOdrzuvaci()
    {
        return this.odrzuvacDao.findAll();
    }

    @GetMapping("/odrzuvacpod100")
    public List<Odrzuvac> getOdzuvaci()
    {
        final String sql="SELECT id, ime, prezime, cena, termin FROM odrzuvac WHERE cena<100 ORDER BY cena";

        return jdbcTemplate.query(sql,(resultSet, i) ->
        {
            int id=Integer.parseInt(resultSet.getString("id"));
            float cena=Float.parseFloat(resultSet.getString("cena"));
            String ime=resultSet.getString("ime");
            String prezime=resultSet.getString("prezime");
            String termin=resultSet.getString("termin");

            return new Odrzuvac(id, ime, prezime, cena, termin);
        });

    }

    @GetMapping("/odrzuvacnaj")
    public List<Odrzuvac> getOdzuvaciNajeftin()
    {
        final String sql="SELECT id, ime, prezime, cena, termin FROM odrzuvac WHERE cena<100 ORDER BY cena LIMIT 1";

        return jdbcTemplate.query(sql,(resultSet, i) ->
        {
            int id=Integer.parseInt(resultSet.getString("id"));
            float cena=Float.parseFloat(resultSet.getString("cena"));
            String ime=resultSet.getString("ime");
            String prezime=resultSet.getString("prezime");
            String termin=resultSet.getString("termin");

            return new Odrzuvac(id, ime, prezime, cena, termin);
        });

    }


}
