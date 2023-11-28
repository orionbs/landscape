package io.orionbs.infrastructure.view.adapter;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.views.View;
import io.orionbs.application.port.ReadArticlePort;
import io.orionbs.domain.model.Article;
import io.orionbs.infrastructure.view.contract.HomeViewContract;
import io.orionbs.infrastructure.view.mapper.ArticleViewMapper;
import io.orionbs.infrastructure.view.model.HomeViewModel;

import java.util.Comparator;

@Controller
public class HomeViewAdapter implements HomeViewContract {

    private final ReadArticlePort articleCacheAdapter;

    public HomeViewAdapter(ReadArticlePort articleCacheAdapter) {
        this.articleCacheAdapter = articleCacheAdapter;
    }

    @Override
    @View(value = "/home.html")
    @Produces(value = MediaType.TEXT_HTML)
    @Get
    public HomeViewModel renderingHomeView() {
        return new HomeViewModel(articleCacheAdapter.readArticles().sorted(Comparator.comparing(Article::writtenAt)).map(ArticleViewMapper::toArticleViewModel).toList());
    }

}
