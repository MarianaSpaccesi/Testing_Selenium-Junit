package com.Reports;
import com.aventstack.extentreports.ExtentReports;

public class ExtentFactory {

    public static ExtentReports getInstance() {
        ExtentReports extent = new ExtentReports();
        extent.setSystemInfo("Selenium Version", "4.9.1");
        extent.setSystemInfo("Windows", "OS");
        return extent;
    }
}