package Practical.demo.BuilderPattern;

public class PhoneBuilder {
    private String phoneType;
    private int ram;
    private double screanSize;
    private int camera;
    private int rom;

    public PhoneBuilder setPhoneType(String phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setscreanSize(double screanSize) {
        this.screanSize = screanSize;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setRom(int rom) {
        this.rom = rom;
        return this;
    }

    public Phone getPhone(){
        return new Phone(phoneType, ram, screanSize, camera, rom);
    }
}
