package caracteristicas.da.linguagem;

import java.util.Date;

public class Exemplo02 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1563127311564

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Sun Jul 14 15:01:51 BRT 2019

    }
}
