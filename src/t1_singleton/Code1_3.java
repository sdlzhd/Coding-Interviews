package t1_singleton;


/**
 * 改进的多线程实现
 */
public class Code1_3 {
    private Code1_3() {
    }


    private static Code1_3 instance = null;

    public static Code1_3 getInstance() {
        // 未初始化实例
        if (instance == null) {
            // 对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建
            synchronized (Code1_3.class) {
                // 未初始化实例
                if (instance == null) {
                    instance = new Code1_3();
                }
            }
        }
        return instance;
    }
}
