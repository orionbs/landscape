package io.orionbs.infrastructure.cache.model;

import java.sql.Timestamp;

public record ArticleCacheModel(String title, String synopsis, Timestamp writtenAt) {
}
