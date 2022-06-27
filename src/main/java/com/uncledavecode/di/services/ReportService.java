package com.uncledavecode.di.services;

import com.uncledavecode.di.interfaces.BaseDataGenerator;
import com.uncledavecode.di.interfaces.CustomQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService{
    /**
     * 1. Constructor Injection
     * 2. Setters Injection
     * 3. Field Injection
     */


    //Constructor Injection (Implicit @Autowired)
    private final BaseDataGenerator dataGeneratorRepo;

//    public ReportService(@Qualifier("dataGenerator1Repo") BaseDataGenerator dataGeneratorRepo) {
//        this.dataGeneratorRepo = dataGeneratorRepo;
//    }
    public ReportService(BaseDataGenerator dataGeneratorRepo) {
        this.dataGeneratorRepo = dataGeneratorRepo;
    }

    //Setter Injection
//    private BaseDataGenerator dataGeneratorRepo;
//    @Autowired
//    public void setDataGeneratorRepo(BaseDataGenerator dataGeneratorRepo) {
//        this.dataGeneratorRepo = dataGeneratorRepo;
//    }

    //Field Injection
//    @Autowired
//    private BaseDataGenerator dataGeneratorRepo;

    public void generateReport() {
        System.out.println("Generating Report:");
        var data = this.dataGeneratorRepo.generateFakeData();
        if (data != null && !data.isEmpty()) {
            data.forEach(item -> System.out.printf("%s : %f%n", item.getName(), item.getValue()));
        }
    }
}
