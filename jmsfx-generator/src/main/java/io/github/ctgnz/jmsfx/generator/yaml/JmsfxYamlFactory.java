package io.github.ctgnz.jmsfx.generator.yaml;

import java.io.IOException;
import java.io.Writer;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactoryBuilder;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

public class JmsfxYamlFactory extends YAMLFactory {
    private static final long serialVersionUID = 1L;

    public JmsfxYamlFactory(YAMLFactoryBuilder b) {
        super(b);
    }

    @Override
    protected YAMLGenerator _createGenerator(Writer out, IOContext ctxt) throws IOException {
        int feats = _yamlGeneratorFeatures;
        if (_dumperOptions == null) {
            return new JmsfxYamlGenerator(ctxt, _generatorFeatures, feats,
                    _quotingChecker, _objectCodec, out, _version);
        } else {
            return new JmsfxYamlGenerator(ctxt, _generatorFeatures, feats,
                    _quotingChecker, _objectCodec, out, _dumperOptions);
        }
    }
}
