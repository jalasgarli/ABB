package Exercise_9.abstract_factory;

public class WindowsButtonFactory implements ButtonFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}
