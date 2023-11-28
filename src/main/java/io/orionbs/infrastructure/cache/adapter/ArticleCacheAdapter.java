package io.orionbs.infrastructure.cache.adapter;

import io.micronaut.context.annotation.Bean;
import io.orionbs.application.port.ReadArticlePort;
import io.orionbs.domain.model.Article;
import io.orionbs.infrastructure.cache.mapper.ArticleCacheMapper;
import io.orionbs.infrastructure.cache.model.ArticleCacheModel;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.stream.Stream;

@Bean
public class ArticleCacheAdapter implements ReadArticlePort {
    private final ArticleCacheModel articleCacheModel1 = new ArticleCacheModel("Getting Started with Java Programming", "Welcome to the exciting world of Java programming! Whether you're a beginner or an experienced developer looking to add another language to your skill set, Java is a powerful and widely used language that's worth exploring. In this post, we'll take you through the basics and help you embark on your journey to becoming a Java developer.", Timestamp.valueOf(LocalDateTime.now().minusMonths(3)));
    private final ArticleCacheModel articleCacheModel2 = new ArticleCacheModel("Mastering Exception Handling in Java", "Exception handling is a crucial aspect of Java programming that allows developers to gracefully manage runtime errors and unexpected situations. In this blog post, we'll delve into the world of exceptions, exploring why they occur, how to handle them effectively, and best practices for writing robust Java code.", Timestamp.valueOf(LocalDateTime.now().minusMonths(5)));
    private final ArticleCacheModel articleCacheModel3 = new ArticleCacheModel("Building a Simple Web Application with Java and Spring Boot", "Java isn't just for traditional desktop applications—it's a powerful language for building web applications too. In this blog post, we'll guide you through the process of creating a simple web application using Java and the Spring Boot framework. By the end of this tutorial, you'll have a solid foundation for developing modern, scalable web applications.", Timestamp.valueOf(LocalDateTime.now().minusMonths(7)));

    @Override
    public Stream<Article> readArticles() {
        return Stream
                .of(articleCacheModel1, articleCacheModel2, articleCacheModel3)
                .map(ArticleCacheMapper::toArticle);
    }
}
