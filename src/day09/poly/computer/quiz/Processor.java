package day09.poly.computer.quiz;

class Processor extends ComputerPart {


    public Processor(String cpu, int i) {
        super(cpu, i);
    }

    @Override
    public void describePart() {
        System.out.println("Processor: " + partName + ", Price: " + partPrice);
    }
}