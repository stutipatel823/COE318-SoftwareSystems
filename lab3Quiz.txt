public class Count {
    int value;
    // To write the constructor
    public Count(int value){
     this.value=value;   
    }
    public void increment() {
        if (value >= 0)
        value = value + 1; 
    }
    public int getValue() {
        return value; 
    }

    Counter headCount, tailCount;
    tailCount = new Count(0);
    headCount = new Count(0);
    for ( int flip = 0; flip < 100; flip++ ) {
    if (Math.random() < 0.5) // There's a 50/50 chance that this is true.
    headCount.increment(); // Count a "head".
    else
    tailCount.increment() ; // Count a "tail".
}
System.out.println("There were " + headCount.getValue() + " heads.");
System.out.println("There were " + tailCount.getValue() + " tails.")

