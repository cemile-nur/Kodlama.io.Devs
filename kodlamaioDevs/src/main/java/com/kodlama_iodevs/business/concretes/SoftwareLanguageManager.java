package com.kodlama_iodevs.business.concretes;

import com.kodlama_iodevs.business.abstracts.ISoftwareLanguageService;
import com.kodlama_iodevs.business.request.CreateLanguageRequest;
import com.kodlama_iodevs.business.responses.GetAllLanguageResponse;

import java.util.List;

public class SoftwareLanguageManager implements ISoftwareLanguageService {
    @Override
    public List<GetAllLanguageResponse> getAll() {
        return null;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {

    }

    @Override
    public void delete(CreateLanguageRequest createLanguageRequest) {

    }

    @Override
    public void update(CreateLanguageRequest createLanguageRequest) {

    }
}
