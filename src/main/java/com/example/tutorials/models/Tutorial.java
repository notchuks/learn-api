package com.example.tutorials.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial() {}

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return this.published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tutorial)) {
            return false;
        }
        Tutorial tutorial = (Tutorial) o;
        return Objects.equals(this.id, tutorial.id) && Objects.equals(this.title, tutorial.title) &&
                Objects.equals(this.description, tutorial.description) && Objects.equals(this.published, tutorial.published);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.title, this.description, this.published);
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
