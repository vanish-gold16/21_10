public class Akvarium {
    int sirka;
    int vyska;
    int delka;
    float voda;

    public Akvarium(int sirka, int vyska, int delka, float voda) {
        this.sirka = sirka;
        this.vyska = vyska;
        this.delka = delka;
        this.voda = voda;
    }

    public String overeni(int sirka, int vyska, int delka, float voda){
        this.sirka = sirka;
        this.vyska = vyska;
        this.delka = delka;
        this.voda = voda;
        if(sirka > 0 && vyska > 0 && delka > 0 && voda >= 0){
            return "Tento akvarium existuje";
        }
        else
            return "Tento akvarium neexistuje";
    }

    public String vejde(int sirka, int vyska, int delka, float voda){
        this.sirka = sirka;
        this.vyska = vyska;
        this.delka = delka;
        this.voda = voda;

        int objem = sirka*vyska*delka;

        if(voda <= objem){
            return "Voda vejde do akvariu";
        }
        else
            return "Voda nevejde do akvariu";
    }

    @Override
    public String toString() {
        return "Akvarium ma sirku " + sirka + "dm, vysku " + vyska + "dm, delku " + delka + "dm, a ma v sobe " + voda +
                " litru vody. " + "Objem je " + sirka*vyska*delka +"dm3. "+ overeni(getSirka(), getVyska(), getDelka(), getVoda()) + ". " + vejde(getSirka(), getVyska(), getDelka(), getVoda()) + '.';
    }

    public int getSirka() {
        return sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public int getDelka() {
        return delka;
    }

    public void setDelka(int delka) {
        this.delka = delka;
    }

    public float getVoda() {
        return voda;
    }

    public void setVoda(float voda) {
        this.voda = voda;
    }
}
