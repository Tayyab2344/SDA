import java.util.List;

public class NotificationService implements GroupJoinObserver {

    private List<String> members;

    public NotificationService(List<String> members) {
        this.members = members;
    }

    @Override
    public void update(String message, String newMember) {
        for (String member : members) {
            System.out.println("Notification sent to " + member + ": " + message);
        }
        System.out.println("Notification sent to " + newMember + ": " + message);
    }
}
