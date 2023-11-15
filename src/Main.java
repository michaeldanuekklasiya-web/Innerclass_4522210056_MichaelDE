public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "MSI KATANA");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i5");

        CPU.RAM rs32GB = myKomputer.new RAM(16, "Micro-Star International");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
        CPU.Harddisk myHarddisk = myKomputer.new Harddisk(1000, "SSD");
        CPU.VGACard myVGACard = myKomputer.new VGACard("NVIDIA RTX 3080", 10);
        CPU.Motherboard myMotherboard = myKomputer.new Motherboard("ASUS ROG Strix Z590", "Intel Z590");
        CPU.PowerSupply myPowerSupply = myKomputer.new PowerSupply(750, "80 Plus Gold");

        // Memanggil metode untuk mendapatkan informasi masing-masing komponen
        myHarddisk.getHarddiskInfo();
        myVGACard.getVGACardInfo();
        myMotherboard.getMotherboardInfo();
        myPowerSupply.getPowerSupplyInfo();
    }
}
