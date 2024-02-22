package Exercise_9.abstract_factory;

public class AndroidButtonFactory implements ButtonFactory{
    public Button createButton() {
        return new AndroidButton();
    }
}
