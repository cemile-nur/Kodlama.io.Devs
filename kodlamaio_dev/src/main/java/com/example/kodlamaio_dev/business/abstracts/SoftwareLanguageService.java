package com.example.kodlamaio_dev.business.abstracts;

import com.example.kodlamaio_dev.entities.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> getAll();
    SoftwareLanguage getById(int id);

    void add(SoftwareLanguage softwareLanguage,int id) throws Exception;
    void delete(SoftwareLanguage softwareLanguage,int id);
    void update(SoftwareLanguage softwareLanguage,int id);
}
