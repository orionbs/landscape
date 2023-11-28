package io.orionbs.domain.model;

import java.time.LocalDate;
import java.util.Objects;

public record Article(String title, String synopsis, LocalDate writtenAt) {
    public Article {
        Objects.requireNonNull(title, "Le titre d'un article ne peut pas être nul.");
        Objects.requireNonNull(synopsis, "Le synopsis d'un article ne peut pas être nul.");
    }

}
