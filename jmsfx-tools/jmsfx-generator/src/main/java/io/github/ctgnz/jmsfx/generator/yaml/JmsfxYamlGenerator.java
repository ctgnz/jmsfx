package io.github.ctgnz.jmsfx.generator.yaml;

import java.io.IOException;
import java.io.Writer;

import org.apache.commons.lang3.ArrayUtils;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.DumperOptions.Version;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.fasterxml.jackson.dataformat.yaml.util.StringQuotingChecker;

public class JmsfxYamlGenerator extends YAMLGenerator {

    public JmsfxYamlGenerator(IOContext ctxt, int jsonFeatures, int yamlFeatures, StringQuotingChecker quotingChecker, ObjectCodec codec, Writer out, DumperOptions dumperOptions) throws IOException {
        super(ctxt, jsonFeatures, yamlFeatures, quotingChecker, codec, out, dumperOptions);
    }

    public JmsfxYamlGenerator(IOContext ctxt, int jsonFeatures, int yamlFeatures, StringQuotingChecker quotingChecker, ObjectCodec codec, Writer out, Version version) throws IOException {
        super(ctxt, jsonFeatures, yamlFeatures, quotingChecker, codec, out, version);
    }

    @Override
    public void writeStartObject(Object forValue) throws IOException {
        YamlFlowStyle annotation = forValue.getClass().getAnnotation(YamlFlowStyle.class);
        _outputOptions.setDefaultFlowStyle(annotation != null ? FlowStyle.FLOW : FlowStyle.BLOCK);
        super.writeStartObject(forValue);
    }

    @Override
    public void writeStartArray(Object forValue, int size) throws IOException {
        _outputOptions.setDefaultFlowStyle(FlowStyle.BLOCK);
        super.writeStartArray(forValue, size);
    }

    @Override
    public void writeString(String text) throws IOException, JsonGenerationException {
        Object currentValue = _writeContext.getCurrentValue();
        YamlForceQuote annotation = currentValue.getClass().getAnnotation(YamlForceQuote.class);
        if (annotation != null && ArrayUtils.contains(annotation.properties(), _writeContext.getCurrentName())) {
            disable(Feature.MINIMIZE_QUOTES);
            super.writeString(text);
            enable(Feature.MINIMIZE_QUOTES);
        } else {
            super.writeString(text);
        }
    }

}
