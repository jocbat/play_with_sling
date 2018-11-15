import org.apache.sling.api.resource.Resource;
import org.apache.sling.testing.mock.sling.ResourceResolverType;
import org.apache.sling.testing.mock.sling.junit.SlingContext;
import org.junit.Rule;
import org.junit.Test;

public class ExampleTest {

    @Rule
    public final SlingContext context = new SlingContext(ResourceResolverType.JCR_JACKRABBIT);


    @Test
    public void testSomething() {
        Resource resource = context.resourceResolver().getResource("/content/sample/en");
        // further testing
    }

}