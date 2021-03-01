package models.adapter;

public class ForeignPlayer{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void JinGong(){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(this.getClass().getName() + " - " + this.name + " - " + methodName);
    }

    public void FangShou(){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(this.getClass().getName() + " - " + this.name + " - " + methodName);
    }
}
