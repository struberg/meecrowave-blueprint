package net.struberg.blueprints.meecrowave;

import javax.inject.Inject;
import org.apache.meecrowave.Meecrowave;
import org.apache.meecrowave.junit.MonoMeecrowave;
import org.apache.meecrowave.testing.ConfigurationInject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


/**
 * Test for {@link SignatureService}
 * @author <a href="mailto:struberg@apache.org">Mark Struberg</a>
 */

@RunWith(MonoMeecrowave.Runner.class)
public class SignatureServiceTest {

    @ConfigurationInject
    private Meecrowave.Builder configuration;
    
    private @Inject SignatureService signatureService;
    
    @Test
    public void testSigning() {
        final String signed = signatureService.sign("https://bla.server", "sign me");
        assertEquals("expectedResult", signed);
    }
}
