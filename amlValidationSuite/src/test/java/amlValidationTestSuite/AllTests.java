package amlValidationTestSuite;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({AMLDocumentVersions.class,
				AMLInstanceRequirements.class,				
				AMLPaths.class,			
				AMLMetaInformation.class, 
				AMLObjectIdentification.class, 
				AMLClassRequirements.class})
public class AllTests {

}
