public class Reformatory {
    
    private int weightsMeasuredCount = 0;

    public int weight(Person person) {        
       // return the weight of the person
        
        this.weightsMeasuredCount++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return this.weightsMeasuredCount;
    }

}
