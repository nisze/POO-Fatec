package main;
import calc.Faculdade;

public class Main {
    public static void main(String[] args) {
        Faculdade aluno2 = new Faculdade("OLIVER", "58738213", 8.0, "COMEX");
        Faculdade aluno = new Faculdade("OLIVER", "58738213", 9.75, "COMEX", 2383);
        System.out.println(aluno);
        System.out.println(aluno2);

        String test = "OLIVER";
    }
}