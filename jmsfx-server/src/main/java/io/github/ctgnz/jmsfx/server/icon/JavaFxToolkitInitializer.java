package io.github.ctgnz.jmsfx.server.icon;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javafx.application.Platform;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class JavaFxToolkitInitializer {

    @PostConstruct
    public void start() throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(1);
        Platform.startup(ready::countDown);
        ready.await(10, TimeUnit.SECONDS);
        Platform.setImplicitExit(false);
    }

}
