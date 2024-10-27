package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void after(Scenario senaryo)
    {
        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/CucumberTestSonuçlari.xlsx",
                senaryo.getName(),
                senaryo.isFailed() ? "Fail": "Passed"
        );


        if (senaryo.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }

        GWD.quitDriver();
    }
}
