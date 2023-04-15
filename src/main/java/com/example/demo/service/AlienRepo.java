package com.example.demo.service;

import com.example.demo.model.Alien;
import com.example.demo.model.Mercury;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien,Integer> {

//            List<Alien>findByLang(String lang);
//            List<Alien>findByAidGreaterThan(int aid);
//            @Query("from Alien where lang=?1 order by aname")
//            List<Alien>findByTechSorted(String lang);

}
