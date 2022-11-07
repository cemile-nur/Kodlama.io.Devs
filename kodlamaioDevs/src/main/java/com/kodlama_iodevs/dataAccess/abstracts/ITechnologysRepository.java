package com.kodlama_iodevs.dataAccess.abstracts;


import com.kodlama_iodevs.entities.concretes.TechnologysOfLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITechnologysRepository extends JpaRepository<TechnologysOfLanguage,Integer> {
}
