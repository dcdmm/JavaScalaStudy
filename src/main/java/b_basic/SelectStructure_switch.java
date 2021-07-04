package b_basic;

/**
 * 条件选择结构:switch语句
 */
public class SelectStructure_switch {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {  // 数据类型可以是:byte,short,int,char,emum,String
            case 'A':
                System.out.print("A");
                break;
            case 'B':
                // 当switch的变量等于case中的值时,该case之后的语句将一直执行,直到遇到break语句为止
                // 故此程序输出为BCD
                System.out.print("B");
            case 'C':
                System.out.print("C");
            case 'D':
                System.out.print("D");
                break;
            case 'F':
                System.out.print("F");
                break;
            default:
                // 如果没有相匹配的case标签,而有default子句,就会执行这个子句
                System.out.print("default");
        }
    }
}

