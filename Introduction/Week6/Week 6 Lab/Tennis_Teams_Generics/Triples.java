public class Triple <A, B, C>{

    A team; //team item with type A
    B won;  //won item with type B
    C lost;  //lost item with type C

    public Triple(A a, B b, C c ) {  //In the constructor to force population at instantiation time

        // A and B and C are the types and a and b  and c are the variables that hold the type

        team = a; //item team is stored in variable a
        won = b;
        lost = c;


    }

    public A getTeam() {
        return team;
    }

    public B getWon() {
        return won;
    }

    public C getLost() {
        return lost;
    }
}
