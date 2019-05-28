public class Main {
    public String  color;
    public String tamaño;

    public Main() { //constructor

    }

    public String getColor() {
        return color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Main obj = new Main();
        obj.setTamaño("grande");
        obj.setColor("color");

    }
}
