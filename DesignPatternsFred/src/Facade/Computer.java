package Facade;

/* Facade */
class Computer {

    long BOOT_ADDRESS = 150;
    long BOOT_SECTOR = 10;
    int SECTOR_SIZE = 75;
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public Computer() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
