/**
 *
 */
package io.github.ctgnz.jmsfx.generator.yaml;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
/**
 * Indicates that the annotated class should be output using YAML Flow style rather than Block
 * @author ctg
 */
public @interface YamlFlowStyle {

}
