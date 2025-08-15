package Practical.demo.BuilderPattern;

public class Phone {

    private String phoneType;
    private int ram;
    private double screanSize;
    private int camera;
    private int rom;

    public Phone(String phoneType, int ram, double screanSize, int camera, int rom) {
        this.phoneType = phoneType;
        this.ram = ram;
        this.screanSize = screanSize;
        this.camera = camera;
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneType='" + phoneType + '\'' +
                ", ram=" + ram +
                ", ScreanSize=" + screanSize +
                ", camera=" + camera +
                ", rom=" + rom +
                '}';
    }
}
