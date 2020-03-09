package com.privateclass.privateClasses.dao;

import com.privateclass.privateClasses.model.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KorisnikDao extends JpaRepository<Korisnik,Integer>
{

}
