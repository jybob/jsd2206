package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IlllegalException {
        if(age<0||age>100){
            throw new IlllegalException("年龄不合法");
        }
        this.age = age;

    }

}
