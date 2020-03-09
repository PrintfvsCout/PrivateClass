package com.privateclass.privateClasses.api;


import com.privateclass.privateClasses.dao.KorisnikDao;
import com.privateclass.privateClasses.model.Korisnik;
import com.privateclass.privateClasses.model.Odrzuvac;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;

@RequestMapping("/views")
@RestController
public class KorisnikController
{
    private final KorisnikDao korisnikDao;
    private final JdbcTemplate jdbcTemplate;

    public KorisnikController(KorisnikDao korisnikDao, JdbcTemplate jdbcTemplate)
    {
        this.korisnikDao = korisnikDao;
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/korisnici")
    public List<Korisnik> getAll()
    {
        return this.korisnikDao.findAll();
    }

    @GetMapping("/novkor")
    public Korisnik novKorisnik()
    {
        Korisnik korisnik = new Korisnik();
        korisnik.setId(7);
        korisnik.setIme("Korisnik");
        korisnik.setPrezime("Novlmao");
        korisnik.setNacin_plakjanje("kesh");
        korisnik.setPoseben_termin(ZonedDateTime.now());
        return  this.korisnikDao.save(korisnik);

    }

}
