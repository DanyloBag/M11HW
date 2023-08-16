package ex4;


public class RandomAlg {
    private long a,c,m,x;


    public RandomAlg() {
        this.a = 25214903917L;
        this.c = 11;
        this.m = 2^48;
    }

    public RandomAlg withSeed(long x){
        this.x = x;
        return this;
    }

    public int getRandomNumber(){
        return (int) ((a * (x++) + c )%m);
    }
}
