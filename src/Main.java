import dominio.*;

public class Main {
    public static void main(String[] args) {

        //CPU
        CPU cpu = new CPU();

        cpu.setType("AMD");
        cpu.setGeneracion("7");
        cpu.setNucleo("8 / 16");
        cpu.setArquitectura("zen 5");
        cpu.setMemCache("640 KB / 8 MB / 96 MB");
        cpu.setVelocidad("4.7 Ghz");

        CPU cpu2 = new CPU();

//        cpu2.setType("Intel");
//        cpu2.setGeneracion("7");
//        cpu2.setNucleo("i7");
//        cpu2.setMemCache("2Mb");
//        cpu2.setVelocidad("3.6Hhz");

        //Memoria RAM
        Memoria ram = new Memoria();

        ram.setType("DDR5");
        ram.setCapacidad("32 GB");
        ram.setVelocidad("6000 MHz");
        ram.setCAS("30");

        //Placa base
        MotherBoard motherboard = new MotherBoard();

        motherboard.setSocket("Am5");
        motherboard.setSlotsExpansion("1 x PCIe 4.0/3.0 x16, 1 x PCIe 4.0/3.0 x16 (x4), 2 x PCIe 4.0/3.0 x1");
        motherboard.setMemoriaMaxima("4 x DIMM DDR5, hasta 128 GB, Dual Channel");
        motherboard.setTamanyo("ATX (305 mm x 244 mm)");

        //Caja
        Caja caja = new Caja();

        caja.setDimensiones("221 mm de ancho x 486 mm de fondo x 459 mm de altura. Peso: 5,3 kg");
        caja.setCompatibilidadSuperior("ATX y Micro ATX");
        caja.setConectividadCompleta("Acceso a 2 puertos USB 3.2 Gen 1 tipo A, 1 USB Tipo C de alta velocidad (USB 3.2 Gen 2)");

        //Refrigeracion
        Refrigeracion refrigeracion = new Refrigeracion();

        refrigeracion.setTamanyo("392x121x27mm");
        refrigeracion.setCompactible("Compatible con Intel LGA 17XX/12XX/115X/20xx/1366\n" + "Compatible con AMD: AM5/AM4/AM3/AM3+/AM2+/TR4/TRX4/FM2+/FM2/FM1");
        refrigeracion.setVentiladores("x3");

        //Fuente de alimentacion
        FuenteAlimentacion fuenteAlimentacion = new FuenteAlimentacion();

        fuenteAlimentacion.setDimensiones("150*140*86");
        fuenteAlimentacion.setConectividad("1 cable conector ATX de 24 pines (24 pines)\n" + "2 cables conectores ATX 12V/EPS12V de 8 pines (4+4 pines)\n" + "1 cable conector PCIe de 8 pines (6+2 pines)\n" + "1 cable conector 12V-2x6 (12+4 pines) de 600 W\n" + "1 cable PCIe de 12V-2x6 (12+4 pines) a doble PCIe de 8 pines (6+2 pines)\n" + "6 conectores SATA\n" + "2 conectores PATA");
        fuenteAlimentacion.setPotencia("1000W");

        //Tarjeta Grafica
        TarjetaGrafica tarjetaGrafica = new TarjetaGrafica();

        tarjetaGrafica.setTipo("GDDR7");
        tarjetaGrafica.setDimensiones("304 mm / 50 mm / 126 mm");

        //Disco Duro
        DiscoDuro discoDuro = new DiscoDuro();

        discoDuro.setTipo("PCle Gen4 NVme 1.4");
        discoDuro.setCapacidad("1 TB");
        discoDuro.setVelocidadEscritura("6100 MB/s");
        discoDuro.setVelocidadLectura("7000 MB/s");

        //Tarjeta de sonido
        TarjetaSonido tarjetaSonido = new TarjetaSonido();

        tarjetaSonido.setProcesador("Sound Core3D");
        tarjetaSonido.setDNR("122 dB");


        //Visualiza los valores
        System.out.println(cpu.getType());
        System.out.println(cpu.getGeneracion());
        System.out.println(cpu.getNucleo());
        System.out.println(cpu.getMemCache());
        System.out.println(cpu.getVelocidad());


    }
}