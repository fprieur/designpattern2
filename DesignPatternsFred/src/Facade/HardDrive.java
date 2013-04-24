package Facade;

class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("HardDrive read lba : " + lba + ", size : " + size);
        return new byte[]{1, 2, 3};
    }
}
