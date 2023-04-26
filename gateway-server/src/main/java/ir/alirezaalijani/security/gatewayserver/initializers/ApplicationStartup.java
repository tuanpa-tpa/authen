package ir.alirezaalijani.security.gatewayserver.initializers;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    public ApplicationStartup() {

    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

    }
}
