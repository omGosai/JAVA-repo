package DS;

class pen {
    private String color;
    private int tip;

    public void setColor(String color) {
        this.color = color;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public int getTip() {
        return tip;
    }

    public String getColor() {
        return this.color;
    }
}
public class hello {


    public static void main(String[] args) {
        pen p = new pen();
        p.setColor("Black");
        System.out.println(p.getColor());
    }
}
