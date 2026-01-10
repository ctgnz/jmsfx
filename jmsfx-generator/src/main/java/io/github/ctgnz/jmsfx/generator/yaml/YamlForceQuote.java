package io.github.ctgnz.jmsfx.generator.yaml;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Indicates a list of properties which should always be quoted in YAML output.
 * @author ctg
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface YamlForceQuote {

    /**
     * @return the list of properties to use quotes
     */
    String[] properties() default {};

}
