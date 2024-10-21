import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(101);
        System.out.println("Cislo je " + a);
        if(a%2 == 1){
            System.out.println("Cislo je liche");
        }
        else if(a%2 == 0){
            System.out.println("Cislo je sude");
        }
        else
            System.out.println("Chyba");

        System.out.println("********************");

        Trojuhelnik trojuhelnik = new Trojuhelnik(10, 5, -4);
        System.out.println(trojuhelnik);
        System.out.println(trojuhelnik.overeni(trojuhelnik.a, trojuhelnik.b, trojuhelnik.c));

        System.out.println("********************");

        Akvarium akvarium = new Akvarium(random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100000));
        System.out.println(akvarium);
    }
}