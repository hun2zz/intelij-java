package day09.poly.computer.quiz;

class Memory extends ComputerPart {

    public Memory(String s, int i) {
        super(s, i);
    }

    @Override
    public void describePart() {
        System.out.println("Memory: " + partName + ", Price: " + partPrice);
    }
}