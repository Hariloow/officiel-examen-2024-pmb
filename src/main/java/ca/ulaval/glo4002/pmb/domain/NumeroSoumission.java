package ca.ulaval.glo4002.pmb.domain;

import java.util.Objects;
import java.util.UUID;

public class NumeroSoumission {
    public static NumeroSoumission creer(String numero) {
        return new NumeroSoumission(numero);
    }

    public static NumeroSoumission generer() {
        return new NumeroSoumission(UUID.randomUUID().toString());
    }

    public final String numero;

    private NumeroSoumission(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NumeroSoumission that)) {
            return false;
        }
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
