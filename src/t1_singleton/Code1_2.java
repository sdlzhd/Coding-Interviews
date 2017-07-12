package t1_singleton;


/**
 * 效率低的多线程实现
 */
public final class Code1_2 {
    private Code1_2() {
    }

    private static Code1_2 instance = null;

    public static synchronized Code1_2 getInstance() {
        if (instance == null) {
            instance = new Code1_2();
        }
        return instance;
    }
}
