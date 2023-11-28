package io.orionbs.infrastructure.view.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.ReflectiveAccess;
import io.micronaut.serde.annotation.Serdeable;

import java.util.Objects;

@Serdeable
@ReflectiveAccess
@Introspected
public record ArticleViewModel(String title, String synopsis, String writtenAt) {
    public ArticleViewModel {
        Objects.requireNonNull(title);
        Objects.requireNonNull(synopsis);
        Objects.requireNonNull(writtenAt);
    }
}
