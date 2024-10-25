package ca.ulaval.glo4002.pmb.domain;

public class PrixFacturationClient {
    private final int facturationClientResidentiel;
    private  final int facturationClientCommercial;

    public PrixFacturationClient(int facturationClientResidentiel, int facturationClientCommercial) {
        this.facturationClientResidentiel = facturationClientResidentiel;
        this.facturationClientCommercial = facturationClientCommercial;
    }
}
