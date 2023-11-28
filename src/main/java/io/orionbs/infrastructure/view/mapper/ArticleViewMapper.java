package io.orionbs.infrastructure.view.mapper;

import io.orionbs.domain.model.Article;
import io.orionbs.infrastructure.view.model.ArticleViewModel;

import java.time.LocalDate;
import java.util.Optional;

public class ArticleViewMapper {
    public static ArticleViewModel toArticleViewModel(Article article) {
        return new ArticleViewModel(
                Optional.of(article)
                        .map(Article::title)
                        .orElse("unspecified"),
                Optional.of(article)
                        .map(Article::synopsis)
                        .orElse("unspecified"),
                Optional.of(article)
                        .map(Article::writtenAt)
                        .map(LocalDate::toString)
                        .orElse("unspecified")
        );
    }
}
