import dominio.CPU;

public class Main {
    public static void main(String[] args) {

        //Me creo un procesador en blanco
        CPU cpu = new CPU();

        cpu.setType("AMD");
        cpu.setGeneracion("7");
        cpu.setNucleo("i7");
        cpu.setMemCache("2Mb");
        cpu.setVelocidad("3.6Hhz");

        CPU cpu2 = new CPU();


        //Visualiza los valores
        System.out.println(cpu.getType());
        System.out.println(cpu.getGeneracion());
        System.out.println(cpu.getNucleo());
        System.out.println(cpu.getMemCache());
        System.out.println(cpu.getVelocidad());


    }
}