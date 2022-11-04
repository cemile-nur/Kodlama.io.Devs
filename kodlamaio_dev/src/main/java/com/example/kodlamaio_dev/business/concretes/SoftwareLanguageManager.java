package com.example.kodlamaio_dev.business.concretes;

import com.example.kodlamaio_dev.business.abstracts.SoftwareLanguageService;
import com.example.kodlamaio_dev.dataAccess.abstracts.SoftwareLanguageRepository;
import com.example.kodlamaio_dev.entities.concretes.SoftwareLanguage;

import java.util.List;

public class SoftwareLanguageManager implements SoftwareLanguageService {
   private SoftwareLanguageRepository softwareLanguageRepository;
   private static List<SoftwareLanguage> softwareLanguages;

    public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository) {
        this.softwareLanguageRepository = softwareLanguageRepository;
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguageRepository.getAll();
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return softwareLanguageRepository.getById(id);
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage, int id) throws Exception {
     if (softwareLanguage.getName().isEmpty()){
         throw new Exception("Software Language Name cannot be empty");
     }
     for (SoftwareLanguage language:softwareLanguages) {
        if (language.getName().equals(SoftwareLanguage.class.getName())){
            throw new Exception("Software Language Name cannot be same");
        }
            softwareLanguageRepository.add(softwareLanguage, id);

     }
    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage, int id) {
        softwareLanguageRepository.delete(softwareLanguage, id);
    }

    @Override
    public void update(SoftwareLanguage softwareLanguage, int id) {
        softwareLanguageRepository.update(softwareLanguage, id);
    }
}
