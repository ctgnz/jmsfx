package nz.co.ctg.foxglove;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Ignore;
import org.junit.Test;

public class SvgParseIconTest {

    @Test @Ignore
    public void testJmsfxIcons() throws Exception {
        AtomicInteger count = new AtomicInteger(0);
        FoxgloveParser parser = new FoxgloveParser();
        URI uri = new File("D:/git/jmsfx/jmsfx-model/src/main/resources/svg").toURI();
        Files.walkFileTree(Paths.get(uri), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file.getFileName().toString().endsWith(".svg")) {
                    int progress = count.incrementAndGet();
                    if (progress % 100 == 0) {
                        System.out.format("%d parsed%n", progress);
                    }
                    try {
                        parser.parse(Files.newInputStream(file));
                    } catch (Exception e) {
                        System.out.format("Failure: %s%n", file.getFileName());
                    }
                }
                return super.visitFile(file, attrs);
            }
        });
    }

}
