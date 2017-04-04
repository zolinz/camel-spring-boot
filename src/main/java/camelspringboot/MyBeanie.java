package camelspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Zoli on 4/04/2017.
 */
@Component("myBean")
public class MyBeanie {

    @Value("${greeting}")
    private String say;

    public String saySomething() {
        return "hello";
    }
}
