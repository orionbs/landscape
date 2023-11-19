package io.orionbs.infrastructure.view.config;

import io.micronaut.context.MessageSource;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.i18n.ResourceBundleMessageSource;
import jakarta.inject.Singleton;

import java.util.Locale;

@Factory
public class ViewConfiguration {

    @Singleton
    public MessageSource messageSource() {
        return new ResourceBundleMessageSource("i18n.messages", Locale.ENGLISH);
    }
}
