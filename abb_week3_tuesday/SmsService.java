package abb_week3_tuesday;

public interface SmsService {
    // it is abstract that is why it cannot have a body;
    public void sendSms(String mobile, String text);

    default void sendMMS(String mobile, String base64Image) {
        
    }

    public static void iAmStatic() {

    }

    public static String NAME ="static name";
}
