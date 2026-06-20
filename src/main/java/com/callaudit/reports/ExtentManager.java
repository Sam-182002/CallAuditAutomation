package com.callaudit.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.callaudit.config.ConfigReader;

public class ExtentManager {

    private static ExtentReports extent;
    static ConfigReader config = new ConfigReader();

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = config.getConfigData("report.path");
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setDocumentTitle("Call Audit Test Report");
            spark.config().setReportName("Call Audit Application v8.0.1");
            spark.config().setTheme(Theme.DARK);
            spark.config().setEncoding("UTF-8");
//           ----------- Custom CSS to add Telesoft Labs logo and adjust layout -----------
            String css =
            	    ".nav-logo {" +
            	    "margin-left: -25px !important;" +
            	    "}" +
            	    ".nav-logo .logo {" +
            	    "background-image: url('" + config.getConfigData("report.logopath") + "') !important;" +
            	    "background-repeat: no-repeat !important;" +
            	    "background-size: contain !important;" +
            	    "background-position: left center !important;" +
            	    "width: 75px !important;" +
            	    "height: 40px !important;" +
            	    "}" +
            	    ".search-box {" +
            	    "margin-left: 40px !important;" +
            	    "}";
            spark.config().setCss(css);
  // ----------- Custom JavaScript to make the logo clickable and open in a new tab -----------
            String js =
            	    "document.querySelector('.nav-logo a').href='https://www.telesoftlabs.com/';" +
            	    "document.querySelector('.nav-logo a').target='_blank';" +
            	    "document.querySelector('link[rel=\"shortcut icon\"]').href='" + config.getConfigData("report.logopath") + "';" +
            	    "document.querySelector('link[rel=\"apple-touch-icon\"]').href='" + config.getConfigData("report.logopath") + "';";

            spark.config().setJs(js);

            extent = new ExtentReports();
            extent.attachReporter(spark);
// ----------- Adding system information to the report --------------
            extent.setSystemInfo("Application", "Call Audit Application");
            extent.setSystemInfo("Version", "8.0.1");
            extent.setSystemInfo("Environment", config.getConfigData("env"));
            extent.setSystemInfo("Browser", config.getConfigData("browser"));
            extent.setSystemInfo("Author", "Samprith");
        }
        return extent;
    }
}
