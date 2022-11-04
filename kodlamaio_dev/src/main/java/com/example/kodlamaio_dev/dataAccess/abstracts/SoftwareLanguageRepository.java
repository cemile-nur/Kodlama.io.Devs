package com.example.kodlamaio_dev.dataAccess.abstracts;

import com.example.kodlamaio_dev.entities.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageRepository {

    List<SoftwareLanguage> getAll();
    SoftwareLanguage getById(int id);
    void add(SoftwareLanguage softwareLanguage,int id);
    void delete(SoftwareLanguage softwareLanguage,int id);
    void update(SoftwareLanguage softwareLanguage,int id);
}
