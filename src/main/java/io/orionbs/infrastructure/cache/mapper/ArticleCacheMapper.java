package io.orionbs.infrastructure.cache.mapper;

import io.orionbs.domain.model.Article;
import io.orionbs.infrastructure.cache.model.ArticleCacheModel;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

public class ArticleCacheMapper {
    public static Article toArticle(ArticleCacheModel articleCacheModel) {
        return new Article(
                Optional.of(articleCacheModel)
                        .map(ArticleCacheModel::title)
                        .orElse("unspecified"),
                Optional.of(articleCacheModel)
                        .map(ArticleCacheModel::synopsis)
                        .orElse("unspecified"),
                Optional.of(articleCacheModel)
                        .map(ArticleCacheModel::writtenAt)
                        .map(Timestamp::toLocalDateTime)
                        .map(LocalDateTime::toLocalDate)
                        .orElse(null)
        );
    }
}
