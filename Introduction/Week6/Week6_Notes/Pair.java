public class Pair<A,B> {  //A and B are the TYPES. Creating a generic PAIR CLASS

    A first;   //first item with the type A
    B second;  //second item with the type B

    public Pair(A a, B b) {   //In the constructor to force population at instantiation time
        // A and B are the types and a and b are the variables that hold the type
        first = a;
        second = b;  //

    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;

    }

}
