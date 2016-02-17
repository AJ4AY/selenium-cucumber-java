@RunWith(Cucumber.class)
@Cucumber.Options(features = "src/test/resources/features/avl/",tags = {"@avl_acceptance_test"},format = {"html:src/test/resources/test_reports/cucumber_reports/avl_acceptance_test"})
public class RunAT{
}
