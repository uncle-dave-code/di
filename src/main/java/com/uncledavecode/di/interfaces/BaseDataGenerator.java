package com.uncledavecode.di.interfaces;

import com.uncledavecode.di.classes.ReportData;

import java.util.List;

public interface BaseDataGenerator {
    List<ReportData> generateFakeData();
}
