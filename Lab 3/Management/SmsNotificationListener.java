import java.io.File;

class SmsNotificationListener implements EventListener {
    private String phoneNumber;

    public SmsNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String message = "Someone performed the " + eventType + " operation on the file: " + file.getName();

        if (message.length() > 160) {
            System.out.println("Warning: SMS message exceeds 160 characters. Message not sent.");
        } else {
            sendSms(phoneNumber, message);
        }
    }

    private void sendSms(String phoneNumber, String message) {
        // This is a stub for actual SMS sending functionality
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
