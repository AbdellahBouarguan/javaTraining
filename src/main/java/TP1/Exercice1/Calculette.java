package TP1.Exercice1;

public class Calculette {
    private int a,b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Calculette(){
    }
    public Calculette(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public Calculette(Calculette C) {
        this.a = C.a;
        this.b = C.b;
    }

    public int addition(){
        return  a+b;
    }
    public int soustraction(){
        return a-b;
    }
    public int multiplication(){
        return a*b;
    }
    public double division(){

        if (b == 0) throw new ArithmeticException("Impossible de faire la devision entre "+a+" et "+b);
        return (double)a/b;

    }
}
