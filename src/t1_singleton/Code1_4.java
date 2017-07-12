package t1_singleton;

/**
 * 静态构造函数实现
 */
public class Code1_4 {
    private Code1_4(){}

    private static final Code1_4 instance = new Code1_4();

    public static Code1_4 getInstance(){
        return instance;
    }
}
