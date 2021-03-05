package testProfessor;

public class Professor {
    public String name;
    public String enrollment;
    public String rg;
    public String cpf;

    public void print () {
        System.out.println("--------------");
        System.out.println(this.cpf);
        System.out.println(this.enrollment);
        System.out.println(this.name);
        System.out.println(this.rg);
    }
}
