package com.fon.zakazivanjeterminalicna;

import com.fon.zakazivanjeterminalicna.domain.Korisnik;
import com.fon.zakazivanjeterminalicna.domain.MUP;
import com.fon.zakazivanjeterminalicna.domain.Termin;
import com.fon.zakazivanjeterminalicna.repository.KorisnikRepo;
import com.fon.zakazivanjeterminalicna.repository.MUPRepo;
import com.fon.zakazivanjeterminalicna.repository.TerminRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class})
public class ZakazivanjeTerminaLicnaApplication implements CommandLineRunner{

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    TerminRepo terminRepo;
    @Autowired
    KorisnikRepo korisnikRepo;

    @Autowired
    MUPRepo mupRepo;



    public static void main(String[] args) {
        SpringApplication.run(ZakazivanjeTerminaLicnaApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {

    }
}
