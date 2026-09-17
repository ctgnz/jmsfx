package io.github.ctgnz.jmsfx.server.icon;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javafx.application.Platform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class JavaFxToolkitInitializer {

    private static final Logger LOG = LoggerFactory.getLogger(JavaFxToolkitInitializer.class);

    @PostConstruct
    public void start() throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(1);
        try {
            Platform.startup(ready::countDown);
        } catch (RuntimeException | LinkageError e) {
            // Only PNG rendering needs the toolkit, so a headless host - which
            // has no display, and may not carry the native libraries at all -
            // should still serve everything else rather than failing to start.
            LOG.warn("JavaFX toolkit unavailable, PNG rendering disabled: {}", e.toString());
            return;
        }
        ready.await(10, TimeUnit.SECONDS);
        Platform.setImplicitExit(false);
    }

}
