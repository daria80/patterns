package Behavioral.Observer;

import java.util.ArrayList;

public interface PublisherInterface {

    ArrayList<PublisherActionListener> getListeners();

    void addListener(PublisherActionListener listener);

    public void removeListener(PublisherActionListener listener);

    public void removeAllListener();

    public void notifySubscribers(String message);


}
