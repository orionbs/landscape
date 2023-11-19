package io.orionbs.infrastructure.view.adapter;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.views.View;
import io.orionbs.infrastructure.view.contract.HomeViewContract;
import io.orionbs.infrastructure.view.model.HomeViewModel;

@Controller
public class HomeViewAdapter implements HomeViewContract {


    @Override
    @View(value = "/home.html")
    @Produces(value = MediaType.TEXT_HTML)
    @Get
    public HomeViewModel renderingHomeView() {
        return new HomeViewModel("orionbs","");
    }

}
