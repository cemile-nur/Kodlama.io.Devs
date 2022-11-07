package com.kodlama_iodevs.webApı.Controller;

import com.kodlama_iodevs.business.abstracts.ISoftwareLanguageService;
import com.kodlama_iodevs.business.request.CreateLanguageRequest;
import com.kodlama_iodevs.business.responses.GetAllLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class SoftwareLanguageController {
    private ISoftwareLanguageService languageService;

    @Autowired
    public SoftwareLanguageController(ISoftwareLanguageService languageService){
        this. languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
        this.languageService.add(createLanguageRequest);
    }
}
