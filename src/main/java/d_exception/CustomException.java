package d_exception;

/**
 * 自定义异常类:继承Exception类或其子类
 */
public class CustomException extends Exception {
    static final long serialVersionUID = -342419719075766939L;

    public CustomException() {
    }

    // 构造器重载
    public CustomException(String msg) {
        super(msg);
    }
}


class CustomExceptionStudent {
    public static void main(String[] args) {
        CustomExceptionStudent tk = new CustomExceptionStudent();
        try {
            tk.regist_id(-2323);
        } catch (CustomException e) { // CustomException继承自Exception类,必须对异常显式地进行处理(编译时异常)
            e.printStackTrace();
        }
    }

    private int id;

    public void regist_id(int id) throws CustomException {
        if (id > 0) {
            this.id = id;
        } else {
            throw new CustomException("输入的数据非法");
        }
    }
}