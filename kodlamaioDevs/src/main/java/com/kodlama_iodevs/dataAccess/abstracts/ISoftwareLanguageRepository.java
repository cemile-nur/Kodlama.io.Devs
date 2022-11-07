package com.kodlama_iodevs.dataAccess.abstracts;

import com.kodlama_iodevs.entities.concretes.SoftwareLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISoftwareLanguageRepository extends JpaRepository<SoftwareLanguage,Integer> {
}
