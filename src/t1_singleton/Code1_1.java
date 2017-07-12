package t1_singleton;


/**
 * 只适用于单线程环境
 */
public final class Code1_1 {
    private Code1_1() {
    }

    private static Code1_1 instance = null;

    public static Code1_1 getInstance() {
        if (instance == null) {
            instance = new Code1_1();
        }
        return instance;
    }

}
