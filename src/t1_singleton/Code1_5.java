package t1_singleton;

/**
 * 静态内部类实现
 */
public class Code1_5 {
    private Code1_5() {
    }

    public static final Code1_5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Code1_5 INSTANCE = new Code1_5();
    }
}
