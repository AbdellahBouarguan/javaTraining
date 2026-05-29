package TP7.Exercice2;

public class Pair<U, V> {
    private U fst;
    private V snd;

    public Pair(U fst, V snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public U getFst() {
        return fst;
    }

    public void setFst(U fst) {
        this.fst = fst;
    }

    public V getSnd() {
        return snd;
    }

    public void setSnd(V snd) {
        this.snd = snd;
    }
}
