package com.uncledavecode.di;

import com.uncledavecode.di.repository.DataGenerator1Repo;
import com.uncledavecode.di.services.ReportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {

//		var reportRepository = new ReportRepository();
//
//		var reportController = new ReportController(reportRepository, dataGeneratorRepository);
//		reportController.printData();

        var context = SpringApplication.run(DiApplication.class, args);

//        var dataGeneratorRepository = new DataGenerator1Repo();
//
//        var reportService = new ReportService(dataGeneratorRepository);
//        reportService.generateReport();


        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        //var report = context.getBean(ReportService.class);

//        report.generateReport();

    }

}
