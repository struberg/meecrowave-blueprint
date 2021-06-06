package net.struberg.blueprints.meecrowave;

import javax.enterprise.context.ApplicationScoped;

/**
 * Some sample Service.
 * 
 * @author <a href="mailto:struberg@apache.org">Mark Struberg</a>
 */
@ApplicationScoped
public class SignatureService {
    
    public String sign(String remote, String content) {
        return "expectedResult"; //X TODO
    }
    
}
