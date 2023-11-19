package io.orionbs.infrastructure.view.model;

import io.micronaut.core.annotation.ReflectiveAccess;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@ReflectiveAccess
public record HomeViewModel(String title, String slogan) {
}
