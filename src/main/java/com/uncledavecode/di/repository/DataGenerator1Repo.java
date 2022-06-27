package com.uncledavecode.di.repository;

import com.uncledavecode.di.classes.ReportData;
import com.uncledavecode.di.interfaces.BaseDataGenerator;
import com.uncledavecode.di.interfaces.CustomQualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@CustomQualifier("dg1")
@Profile("dg1")
public class DataGenerator1Repo implements BaseDataGenerator {
    @Override
    public List<ReportData> generateFakeData() {
        return List.of(
                new ReportData("Set 1 Name A", 12.23),
                new ReportData("Set 1 Name B", 45.56),
                new ReportData("Set 1 Name C", 23.94),
                new ReportData("Set 1 Name D", 87.83),
                new ReportData("Set 1 Name E", 34.12)
        );
    }
}
