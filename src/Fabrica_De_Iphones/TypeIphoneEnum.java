package Fabrica_De_Iphones;

public enum TypeIphoneEnum {

    IPHONE_X(1), IPHONE_9(2), IPHONE_13_MINI(3);

    final int valor;

    TypeIphoneEnum (int opcao) {
        this.valor = opcao;
    }

}
