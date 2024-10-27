package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_02_UserLogin.feature",
                "src/test/java/FeatureFiles/_03_AdresEkleme.feature",
                "src/test/java/FeatureFiles/_04_TABMenü.feature",
                "src/test/java/FeatureFiles/_05_SepeteÜrün Ekleme.feature",
                "src/test/java/FeatureFiles/_06_ÜrünSiparişi.feature",
                "src/test/java/FeatureFiles/_07_SearchFunctionality.feature",
                "src/test/java/FeatureFiles/_08_WishList.feature"
        },
        glue = {"StepDefinitions"}
        ,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class ParallelTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browserTipi")
    public void beforeClass(String browserTipi)
    {
        GWD.threadBrowserName.set(browserTipi);

    }
}
