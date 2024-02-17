package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports addReport()
	{
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("extentReporter.html");
		ExtentReports report =new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Enviorment", "SIT");
		report.setSystemInfo("TestingType", "Regression");
		report.setSystemInfo("Tester", "Amit");
		return report;
	}

}
