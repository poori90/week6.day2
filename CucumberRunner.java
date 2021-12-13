package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps1.BaseClassAssignment;

@CucumberOptions(features = {"src/test/java/features1/CreateLeadAssign.feature","src/test/java/features1/EditLeadAssign.feature", 
							"src/test/java/features1/MergeLeadAssign.feature","src/test/java/features1/DuplicateLeadAssign.feature",
							"src/test/java/features1/DeleteLeadAssign.feature"},
						glue = "steps1" , monochrome =true , publish =true)
public class CucumberRunner extends BaseClassAssignment {
	
}
