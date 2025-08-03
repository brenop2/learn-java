package ex_4;

import java.awt.*;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date relogio = new  Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString()); // .toString é um metodo que muda o objeto para string
    }
}

class resolucaoTela { //Esse codigo printa a resulição que esta sua tela
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double heigth = screenSize.getHeight();
        System.out.println("Resolução da tela" + (int)width + "x" + (int)heigth );
    }
}
