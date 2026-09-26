package io.github.ctgnz.jmsfx.generator.yaml;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated class should be output using YAML Flow style rather than Block
 *
 * @author ctg
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface YamlFlowStyle {

}
