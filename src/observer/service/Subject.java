package observer.service;


/**
 * 主题接口
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 注销观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 观测值发生改变时调用通知观察者
     */
    public void notifyObserver();


}
