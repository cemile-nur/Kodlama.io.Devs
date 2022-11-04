package com.example.kodlamaio_dev.dataAccess.concretes;

import com.example.kodlamaio_dev.dataAccess.abstracts.SoftwareLanguageRepository;
import com.example.kodlamaio_dev.entities.concretes.SoftwareLanguage;

import java.util.ArrayList;
import java.util.List;

public class InMemorySoftwareLanguageRepository implements SoftwareLanguageRepository {
   List<SoftwareLanguage> softwareLanguages;

   public InMemorySoftwareLanguageRepository(){
       softwareLanguages = new ArrayList<SoftwareLanguage>();
       softwareLanguages.add(new SoftwareLanguage(1,"Java"));
       softwareLanguages.add(new SoftwareLanguage(2,"C#"));
       softwareLanguages.add(new SoftwareLanguage(3,"Python"));
   }


    @Override
    public List<SoftwareLanguage> getAll() {
        return null;
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return null;
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage, int id) {

    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage, int id) {

    }

    @Override
    public void update(SoftwareLanguage softwareLanguage, int id) {

    }
}
