package Exercise_9.abstract_factory;

public class Client {
    public static void main(String[] args) {
        ButtonFactory factory = null;
        Platform platform = Platform.WINDOWS;

        switch (platform) {
            case WINDOWS:
                factory = new WindowsButtonFactory();
                break;
            case MACOS:
                factory = new MacOSButtonFactory();
                break;
            case ANDROID:
                factory = new AndroidButtonFactory();
                break;
            default:
                System.out.println("Error!");
                break;
        }

        Button button = factory.createButton();
        button.button();
    }
}
