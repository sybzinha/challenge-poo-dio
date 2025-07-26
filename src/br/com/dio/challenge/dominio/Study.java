package br.com.dio.challenge.dominio;

public class Study extends Task {

    private int studyHours;

    @Override
    public double calculatePoints() {
        return DEFAULT_PT * studyHours * 1.5;
    }

    public Study() {
    }

    public int getStudyHours() {
        return studyHours;
    }

    public void setStudyHours(int studyHours) {
        this.studyHours = studyHours;
    }

    @Override
    public String toString() {
        return "Study{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", studyHours=" + studyHours +
                '}';
    }
}
