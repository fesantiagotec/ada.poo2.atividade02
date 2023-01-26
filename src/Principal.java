import Fabrica_De_Iphones.IphoneFactory;
import Fabrica_De_Iphones.TypeIphoneEnum;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TypeIphoneEnum typeIphoneEnum = TypeIphoneEnum.IPHONE_X;

        IphoneFactory.imprimirMenu();
        int op = sc.nextInt();

        if (op == 1 ) {
            typeIphoneEnum = TypeIphoneEnum.IPHONE_X;
        } else if (op == 2) {
            typeIphoneEnum = TypeIphoneEnum.IPHONE_9;
        } else if (op == 3) {
            typeIphoneEnum = TypeIphoneEnum.IPHONE_13_MINI;
        } else {
            System.out.println("Operação inválida");
        }

        switch (typeIphoneEnum) {
            case IPHONE_X:
                IphoneFactory iPhone_x = new IphoneFactory("Ios 16", "6 GB", "64 GB", "6.1'", "A14", "12mp");
//                IphoneFactory.imprimirDadosCelular(sistemaOperacional, memoriaRam, memoriaRom, tela, chip, camera);
//                iPhone_x.getSistemaOperacional();
                System.out.println("Sistema Operacional: " + iPhone_x.getSistemaOperacional());
                System.out.println("Memória Ram: " + iPhone_x.getMemoriaRam());
                System.out.println("Memória Rom: " + iPhone_x.getMemoriaRom());
                System.out.println("Tela: " + iPhone_x.getTela());
                System.out.println("Chip: " + iPhone_x.getChip());
                System.out.println("Câmera: " + iPhone_x.getCamera());
                break;
            case IPHONE_9:
                IphoneFactory iPhone_9 = new IphoneFactory("Ios 15", "4 GB", "32 GB", "6.1'", "A14", "10mp");
                System.out.println("Sistema Operacional: " + iPhone_9.getSistemaOperacional());
                System.out.println("Memória Ram: " + iPhone_9.getMemoriaRam());
                System.out.println("Memória Rom: " + iPhone_9.getMemoriaRom());
                System.out.println("Tela: " + iPhone_9.getTela());
                System.out.println("Chip: " + iPhone_9.getChip());
                System.out.println("Câmera: " + iPhone_9.getCamera());
                break;
            case IPHONE_13_MINI:
                IphoneFactory iPhone_13_mini = new IphoneFactory("Ios 17", "12 GB", "128 GB", "6.1'", "A17", "15mp");
                System.out.println("Sistema Operacional: " + iPhone_13_mini.getSistemaOperacional());
                System.out.println("Memória Ram: " + iPhone_13_mini.getMemoriaRam());
                System.out.println("Memória Rom: " + iPhone_13_mini.getMemoriaRom());
                System.out.println("Tela: " + iPhone_13_mini.getTela());
                System.out.println("Chip: " + iPhone_13_mini.getChip());
                System.out.println("Câmera: " + iPhone_13_mini.getCamera());
                break;
        }
    }

}