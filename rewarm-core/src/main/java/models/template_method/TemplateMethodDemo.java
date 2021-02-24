package models.template_method;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Template mall = new Mall();
        mall.templateMethod();

        Template school = new School();
        school.templateMethod();
    }
}
