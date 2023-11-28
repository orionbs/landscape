package io.orionbs.application.port;

import io.orionbs.domain.model.Article;

import java.util.stream.Stream;

public interface ReadArticlePort {
    Stream<Article> readArticles();
}
