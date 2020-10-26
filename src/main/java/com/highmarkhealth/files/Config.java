package com.highmarkhealth.files;

import org.apache.tomcat.util.http.LegacyCookieProcessor;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
        LegacyCookieProcessor legacyCookieProcessor=new LegacyCookieProcessor();
        legacyCookieProcessor.setAllowHttpSepsInV0(true);
        legacyCookieProcessor.setAllowEqualsInValue(true);
        return (factory) -> factory.addContextCustomizers(
                (context) -> context.setCookieProcessor(legacyCookieProcessor)
        );
    }
}
