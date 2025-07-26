package br.com.dio.challenge.dominio;

public abstract class Task {

    protected static final double DEFAULT_PT = 0d;

    private String title;
    private String description;

    public abstract double calculatePoints();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
