package com.priya.springbootjdbctemplatemysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Tutorial {
    private long id;
    private String title;
    private String description;
    private boolean published;

    public Tutorial() {

    }

    public Tutorial(long id, String title, String description, boolean published) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
