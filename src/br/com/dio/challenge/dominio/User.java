package br.com.dio.challenge.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class User {

    private String name;
    private Set<Task> pendingTask = new LinkedHashSet<>();
    private Set<Task> completedTask = new LinkedHashSet<>();

    public void notebookUser(Notebook notebook){
        this.pendingTask.addAll(notebook.getTasks());
    }

    public void completeTask(Task task) {
        if(pendingTask.contains(task)) {
            this.completedTask.add(task);
            this.pendingTask.remove(task);
            System.out.println(this.name + " concluiu: " + task.getTitle());
        } else {
            System.err.println(this.name + " não tem '" + task.getTitle() + "' nas atividades pendentes ou já concluiu.");
        }
    }

    public double calculatePoints() {
        return this.completedTask
                .stream()
                .mapToDouble(Task::calculatePoints)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Task> getPendingTask() {
        return pendingTask;
    }

    public Set<Task> getCompletedTask() {
        return completedTask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(pendingTask, user.pendingTask) && Objects.equals(completedTask, user.completedTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pendingTask, completedTask);
    }
}
