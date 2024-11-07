import java.util.Arrays;

public class StudyGroupApplication {

    public static void main(String[] args) {

        Group studyGroup = new Group("SDA");

        AdminObserver adminObserver = new AdminObserver("Ahmed");
        NotificationService notificationService = new NotificationService(Arrays.asList("Ali", "Sara", "Zain", "Maira", "Usman"));

        studyGroup.addObserver(adminObserver);
        studyGroup.addObserver(notificationService);

        studyGroup.joinGroup("Hassan");

        studyGroup.removeObserver(adminObserver);

        studyGroup.joinGroup("Ayesha");
    }
}
