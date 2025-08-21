package ricardo_paulo.net;

import java.util.Scanner;

public class Student {

    private String name;
    private String registry;
    private short note1;
    private short note2;

    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        name = scan.nextLine();
        System.out.print("Insira a matrícula: ");
        registry = scan.nextLine();

        System.out.print("Insira a nota 1: ");
        short note = scan.nextShort();
        if (note >= 0 && note <= 10) {
            note1 = note;
        }

        System.out.print("Insira a nota 2: ");
        note = scan.nextShort();
        if (note >= 0 && note <= 10) {
            note2 = note;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public short getNote1() {
        return note1;
    }

    public void setNote1(short note1) {
        if (note1 >= 0 && note2 <= 10) {
            this.note1 = note1;
        }
    }

    public short getNote2() {
        return note2;
    }

    public void setNote2(short note2) {
        if (note2 >= 0 && note2 <= 10) {
            this.note2 = note2;
        }
    }

    public double calcNormal() {
        return (double) (note1 + note2)/2;
    }

    public void showInformation() {
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Matrícula: %s\n", registry);
        System.out.printf("Nota 1: %s\n", note1);
        System.out.printf("Nota 2: %s\n", note2);
        System.out.printf("Média das notas: %.2f\n", calcNormal());
    }
}
