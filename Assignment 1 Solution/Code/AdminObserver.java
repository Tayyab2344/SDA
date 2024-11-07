public class AdminObserver implements GroupJoinObserver {

    private String adminName;

    public AdminObserver(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public void update(String message, String newMember) {
        System.out.println(adminName + " received notification: " + message);
    }
}
