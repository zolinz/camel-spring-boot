package camelspringboot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Zoli on 4/04/2017.
 */
@Component
public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:hello?period={{timer.period}}")
                .transform(method("myBean", "saySomething"))
                .to("stream:out");
    }

}
