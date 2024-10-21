public class Trojuhelnik {
    int a;
    int b;
    int c;

    public Trojuhelnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String overeni(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        if(a > 0 && b > 0 && c > 0){
            return "Tento trojuhelnik lze sestrojit";
        }
        else
            return "Tento trojuhelnik nelze sestrojit";
    }

    @Override
    public String toString() {
        return "Strany jsou " +
                " a, " + a + "cm, b = " + b + "cm, c = " + c + "cm";
    }

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
