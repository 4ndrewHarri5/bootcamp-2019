package com.manchesterDigital;

public interface IsChargable {

    void supercharge();

    default void describe() {
        System.out.println("Im green!");
    }

}
