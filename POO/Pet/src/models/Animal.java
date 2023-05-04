package models;

public abstract class Animal implements Comparable{
    protected int xip;
    protected int legs;

    protected Animal(int legs) {this.legs = legs;}

    public void walk(){
        System.out.println("Walking...");
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Animal){
            if (((Animal)o).xip == this.xip){
                return 0;
            } else if (((Animal)o).xip > this.xip) {
                return -1;
            }else {
                return 1;
            }
        }
        return -1;
    }

    public abstract void eat();
}
