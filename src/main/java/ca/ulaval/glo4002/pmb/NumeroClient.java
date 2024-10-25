package ca.ulaval.glo4002.pmb;

import java.util.Objects;

public class NumeroClient {
    public static NumeroClient creer(int numero) {
        return new NumeroClient(numero);
    }

    public final int numero;

    private NumeroClient(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NumeroClient that)) {
            return false;
        }
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
