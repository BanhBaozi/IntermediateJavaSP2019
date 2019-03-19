public class Pair<A, B> {

    A teamName;
    B pctg;

    public Pair(A a, B b) {

        teamName = a;
        pctg = b;

    }

    public A getTeamName() {
        return teamName;
    }


    public B getPctg() {
        return pctg;
    }
}
