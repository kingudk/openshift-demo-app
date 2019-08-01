package dk.kb.cxf.echo.listener;

import dk.kb.cxf.echo.EchoResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitializationContextListener implements ServletContextListener {
    private static final Logger log = LoggerFactory.getLogger(InitializationContextListener.class);


    public void contextInitialized(ServletContextEvent event) {
        log.info("Service Initialized.");

    }

    public void contextDestroyed(ServletContextEvent sce) {
        log.info("Service Shutdown");
    }
}
