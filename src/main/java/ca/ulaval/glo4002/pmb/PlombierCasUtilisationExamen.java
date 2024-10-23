package ca.ulaval.glo4002.pmb;

import java.util.List;

import ca.ulaval.glo4002.pmb.ne_pas_modifier.CodeMateriel;
import ca.ulaval.glo4002.pmb.ne_pas_modifier.EnvoyeurCourriel;
import ca.ulaval.glo4002.pmb.ne_pas_modifier.Quincaillerie;

// Vous devez compléter cette classe (remplacer les TODO), mais vous ne pouvez pas modifier les signatures (sauf constructeur)
public class PlombierCasUtilisationExamen {
    private final Quincaillerie quincaillerie;
    private final EnvoyeurCourriel envoyeurCourriel;

    public PlombierCasUtilisationExamen(Quincaillerie quincaillerie, EnvoyeurCourriel envoyeurCourriel) {
        this.quincaillerie = quincaillerie;
        this.envoyeurCourriel = envoyeurCourriel;
    }

    public Client creerClient(int numeroClient, String nom, TypeClient type, String email) {
        // TODO
        return null; // TODO
    }

    public NumeroSoumission creerSoumission(int numeroClient, float heures, List<CodeMateriel> materiels) {
        // TODO
        return null; // TODO
    }

    public void envoyerSoumission(int numeroClient, String numeroSoumission) {
        // TODO
    }
}
