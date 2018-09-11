package CDSystemAutowiringHandson;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
here no bean is explicitly defined with @Bean annotation. Because, Component scan will scan for all the
classes annotated as @Component and recognizes them as beans.

basePackageClasses directs Spring as to what packages are to be considered for component scanning
 */
@Configuration
@ComponentScan(basePackageClasses = {CDConfig.class, CompactDisc.class})
public class CDConfig {


}
