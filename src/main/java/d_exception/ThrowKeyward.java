package d_exception;

/**
 * throw关键字(类似Python raise关键字)
 */
public class ThrowKeyward {
    public static void main(String[] args) {
        ThrowKeyward tk = new ThrowKeyward();
        try {
            tk.regist(-100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int id;

    public void regist(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            /*
            // Exception的带有形式参数的构造器
            public Exception(String message) {
                super(message);
            }
             */
            throw new Exception("输入的数据非法");  // 使用throw关键字主动触发异常
        }
    }
}
