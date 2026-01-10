package io.github.ctgnz.jmsfx.generator.yaml;

import java.io.IOException;
import java.io.InputStream;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.DumperOptions.LineBreak;
import org.yaml.snakeyaml.LoaderOptions;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.github.ctgnz.jmsfx.generator.GeneratorConfig;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;

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
        DumperOptions options = new DumperOptions();
        options.setPrettyFlow(false);
        options.setDefaultFlowStyle(FlowStyle.BLOCK);
        options.setCanonical(false);
        options.setWidth(480);
        options.setLineBreak(LineBreak.WIN);
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setCodePointLimit(16 * 1024 * 1024);
        YAMLFactory factory = new JmsfxYamlFactory(YAMLFactory.builder()
            .enable(YAMLGenerator.Feature.MINIMIZE_QUOTES)
            .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
            .loaderOptions(loaderOptions)
            .dumperOptions(options));
        ObjectMapper mapper = new ObjectMapper(factory);
        mapper.setSerializationInclusion(Include.NON_DEFAULT);
        mapper.registerModule(new JavaTimeModule());
        SimpleModule module = new SimpleModule("basic");
        mapper.registerModule(module);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return mapper;
    }

}
