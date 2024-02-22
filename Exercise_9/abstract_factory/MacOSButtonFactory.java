package Exercise_9.abstract_factory;

public class MacOSButtonFactory implements ButtonFactory {
    public Button createButton() {
        return new MacOSButton();
    }
}
