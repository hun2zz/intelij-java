package day09.poly.computer.quiz;

class HardDrive extends ComputerPart {


    public HardDrive(String s, int i) {

        super(s, i);
    }

    @Override
    public void describePart() {
        System.out.println("Hard Drive: " + partName + ", Price: " + partPrice);
    }
}