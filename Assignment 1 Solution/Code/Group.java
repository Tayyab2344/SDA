import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<GroupJoinObserver> observers = new ArrayList<>();
    private List<String> members = new ArrayList<>();
    private String groupName;

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addObserver(GroupJoinObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(GroupJoinObserver observer) {
        observers.remove(observer);
    }

    public void joinGroup(String userName) {
        members.add(userName);
        String message = userName + " has joined the group: " + groupName;
        notifyObservers(message, userName);
    }

    private void notifyObservers(String message, String newMember) {
        for (GroupJoinObserver observer : observers) {
            observer.update(message, newMember);
        }
    }
}
