package br.com.dio.challenge.dominio;

public class Workout extends Task {

    private int durationTime;

    @Override
    public double calculatePoints() {
        return DEFAULT_PT + (durationTime/10.0);
    }

    public Workout() {
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", durationTime=" + durationTime +
                '}';
    }
}
