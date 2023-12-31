package io.orionbs.infrastructure.view.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.ReflectiveAccess;
import io.micronaut.serde.annotation.Serdeable;

import java.util.List;
import java.util.Objects;

@Serdeable
@ReflectiveAccess
@Introspected
public record HomeViewModel(List<ArticleViewModel> blogPostList) {
    public HomeViewModel {
        Objects.requireNonNull(blogPostList);
    }
}
