package com.kodlama_iodevs.business.abstracts;

import com.kodlama_iodevs.business.request.CreateLanguageRequest;
import com.kodlama_iodevs.business.responses.GetAllLanguageResponse;

import java.util.List;

public interface ISoftwareLanguageService {
    List<GetAllLanguageResponse> getAll();
    void add(CreateLanguageRequest createLanguageRequest) throws Exception;
    void delete(CreateLanguageRequest createLanguageRequest);


}
