package TP1.Exercice1;

public class Main {
    public static void main(String[] args) {
        Calculette c1,c2,c3;
        c1 = new Calculette();
        try {
            System.out.println(c1.getA()+" / "+c1.getB()+" = "+c1.division());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------");

        c2 = new Calculette(2,9);
        System.out.println(c2.getA()+" + "+c2.getB()+" = "+c2.addition());
        System.out.println(c2.getA()+" - "+c2.getB()+" = "+c2.soustraction());
        System.out.println(c2.getA()+" * "+c2.getB()+" = "+c2.multiplication());

        System.out.println("------");
        c3 = new Calculette(c2);
        System.out.println(""+c3.getA());
        c3.setA(7);
        System.out.println(""+c3.getA());
    }
}
