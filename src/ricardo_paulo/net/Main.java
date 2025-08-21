package ricardo_paulo.net;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Insira o nome do aluno: ");
        String newName = scan.nextLine();
        System.out.print("Insira a matrícula do aluno: ");
        String newRegistry = scan.nextLine();
        System.out.print("Insira as notas (separadas por espaço): ");
        String[] newNotes = scan.nextLine().split(" ");

        student.setName(newName);
        student.setRegistry(newRegistry);
        student.setNote1(Short.parseShort(newNotes[0]));
        student.setNote2(Short.parseShort(newNotes[1]));

        student.showInformation();
    }
}
