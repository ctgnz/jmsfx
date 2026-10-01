package io.github.ctgnz.jmsfx.generator.yaml;

import java.io.IOException;
import java.io.InputStream;

import org.yaml.snakeyaml.DumperOptions.LineBreak;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.github.ctgnz.jmsfx.generator.GeneratorConfig;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.yamlflock.FlockYamlFactory;

public class JmsfxParser {
    private ObjectMapper mapper;

    public JmsfxParser() {
        this.mapper = createBaseObjectMapper();
    }

    public GeneratorConfig readConfig(InputStream inputStream) throws IOException {
        return mapper.readValue(inputStream, GeneratorConfig.class);
    }

    public LibraryModel readLibraryModel(InputStream input) throws IOException {
        return mapper.reader().readValue(input, LibraryModel.class);
    }

    public String writeLibraryModel(LibraryModel library) throws JsonProcessingException {
        return mapper.writeValueAsString(library);
    }

    private ObjectMapper createBaseObjectMapper() {
        // The builder carries the rest: block default flow style, width 480, pretty flow and canonical off,
        // MINIMIZE_QUOTES on, no document start marker, and a 16 MiB code point limit. The line break is the
        // one thing it does not assume - it defaults to LF, and without this call every line of all three
        // model files would be rewritten on the first save.
        ObjectMapper mapper = new ObjectMapper(FlockYamlFactory.builder().lineBreak(LineBreak.WIN).build());
        mapper.setDefaultPropertyInclusion(Include.NON_DEFAULT);
        mapper.registerModule(new JavaTimeModule());
        SimpleModule module = new SimpleModule("basic");
        mapper.registerModule(module);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return mapper;
    }

}
