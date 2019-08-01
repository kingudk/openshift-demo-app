package dk.kb.cxf.echo;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class ApplicationConfig extends Application {
    public Set<Class<?>> getClasses() {
        return new HashSet<>(Arrays.asList(EchoResource.class,JacksonJsonProvider.class));
    }
}
