public class Bird extends Animal {

    private int height_fligth;

    public Bird(int height, int weight, String eyeColor, String voice, int height_fligth) {
        super(height, weight, eyeColor, voice);
        this.height_fligth = height_fligth;
    }
    
    public void Flight(){
        StringBuilder result = new StringBuilder("Я лечу на высоте");
        System.out.println(result.append(this.height_fligth));
    }

    public String Flight2(){
        return String.format("Я лечу на высоте %d метров", this.height_fligth);
    }

    public int getHeight_fligth() {
        return height_fligth;
    }
    
    @Override
    public String toString() {
        return String.format("%s %d", super.toString(), this.height_fligth);
    }
    
}
