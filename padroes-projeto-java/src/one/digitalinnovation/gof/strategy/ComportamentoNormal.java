package one.digitalinnovation.gof.strategy;

import java.net.StandardSocketOptions;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se normalemente...");
    }
}
