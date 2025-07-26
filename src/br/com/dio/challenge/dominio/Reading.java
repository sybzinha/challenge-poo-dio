package br.com.dio.challenge.dominio;

import java.time.LocalDate;

public class Reading extends Task {

    private int numPages;

    @Override
    public double calculatePoints() {
        return DEFAULT_PT + (numPages/10.0);
    }

    public Reading() {
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Reading{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
