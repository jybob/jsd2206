package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
            String str=null;
            System.out.println(str.length());
            String str1="";
            System.out.println(str1.charAt(0));

        }catch (NullPointerException e){
            System.out.println("出现了空指针，并解决了");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("出现了数组下标越界异常，并解决了");
        }
        System.out.println("程序结束了");
    }
}
