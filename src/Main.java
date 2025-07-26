import br.com.dio.challenge.dominio.Notebook;
import br.com.dio.challenge.dominio.Study;
import br.com.dio.challenge.dominio.Workout;
import br.com.dio.challenge.dominio.User;
import br.com.dio.challenge.dominio.Reading;


public class Main {
    public static void main(String[] args) {

        Workout treino1 = new Workout();
        treino1.setTitle("Treino de Musculação -> Leg Day");
        treino1.setDescription("squat, " + "deadlift, " + "leg press, " + "leg extension");
        treino1.setDurationTime(80);

        Workout cardio1 = new Workout();
        cardio1.setTitle("Cardio");
        cardio1.setDescription("Bike");
        cardio1.setDurationTime(20);

        Workout cardio2 = new Workout();
        cardio2.setTitle("Cardio");
        cardio2.setDescription("Caminhada");
        cardio2.setDurationTime(60);

        Reading leitura1 = new Reading();
        leitura1.setTitle("Flores para Algernon");
        leitura1.setDescription("Capítulos 1 a 3");
        leitura1.setNumPages(75);

        Study estudo1 = new Study();
        estudo1.setTitle("Estudar Spring Boot");
        estudo1.setDescription("Assistir aulas e fazer exercícios");
        estudo1.setStudyHours(2);

        Notebook todofriday = new Notebook();
        todofriday.setName("To-do na sexta-feira.");
        todofriday.setDescription("Metas de atividades para a sexta-feira.");
        todofriday.getTasks().add(treino1);
        todofriday.getTasks().add(leitura1);
        todofriday.getTasks().add(estudo1);
        todofriday.getTasks().add(cardio1);

        Notebook todosunday = new Notebook();
        todosunday.setName("To-do no domingo.");
        todosunday.setDescription("Metas de atividades para o domingo.");
        todosunday.getTasks().add(estudo1);
        todosunday.getTasks().add(cardio2);

        User userSyb = new User();
        userSyb.setName("Sybilla");
        userSyb.notebookUser(todofriday);
        System.out.println("Atividades Pendentes Sybilla: " + userSyb.getPendingTask());
        userSyb.completeTask(treino1);
        userSyb.completeTask(leitura1);
        System.out.println("-");
        System.out.println("Atividades Pendentes Sybilla: " + userSyb.getPendingTask());
        System.out.println("Atividades Concluídas Sybilla: " + userSyb.getCompletedTask());
        System.out.println("Total de Pontos da Sybilla: " + userSyb.calculatePoints());

        System.out.println("-------");

        User userRafa = new User();
        userRafa.setName("Rafael");
        userRafa.notebookUser(todofriday);
        System.out.println("Atividades Pendentes Rafael: " + userRafa.getPendingTask());
        userRafa.completeTask(treino1);
        userRafa.completeTask(leitura1);
        userRafa.completeTask(cardio1);
        userRafa.completeTask(estudo1);
        System.out.println("-");
        System.out.println("Atividades Pendentes Rafael: " + userRafa.getPendingTask());
        System.out.println("Atividades Concluídas Rafael: " + userRafa.getCompletedTask());
        System.out.println("Total de Pontos do Rafael: " + userRafa.calculatePoints());

        System.out.println("-------");

        User userGab = new User();
        userGab.setName("Gabriel");
        userGab.notebookUser(todosunday);
        System.out.println("Atividades Pendentes Gabriel: " + userGab.getPendingTask());
        userGab.completeTask(estudo1);
        userGab.completeTask(leitura1);
        userGab.completeTask(cardio2);
        System.out.println("-");
        System.out.println("Atividades Pendentes Gabriel: " + userGab.getPendingTask());
        System.out.println("Atividades Concluídas Gabriel: " + userGab.getCompletedTask());
        System.out.println("Total de Pontos do Gabriel: " + userGab.calculatePoints());
    }
}