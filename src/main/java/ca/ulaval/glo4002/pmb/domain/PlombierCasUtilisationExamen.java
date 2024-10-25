package ca.ulaval.glo4002.pmb;

import java.util.List;

import ca.ulaval.glo4002.pmb.ne_pas_modifier.CodeMateriel;
import ca.ulaval.glo4002.pmb.ne_pas_modifier.EnvoyeurCourriel;
import ca.ulaval.glo4002.pmb.ne_pas_modifier.Quincaillerie;

// Vous devez compléter cette classe (remplacer les TODO), mais vous ne pouvez pas modifier les signatures (sauf constructeur)
public class PlombierCasUtilisationExamen {
    private final Quincaillerie quincaillerie;
    private final EnvoyeurCourriel envoyeurCourriel;
    private final ClientDomainFactory clientDomainFactory;

    public PlombierCasUtilisationExamen(
      Quincaillerie quincaillerie,
      EnvoyeurCourriel envoyeurCourriel,
      ClientDomainFactory clientDomainFactory
    ) {
        this.quincaillerie = quincaillerie;
        this.envoyeurCourriel = envoyeurCourriel;
        this.clientDomainFactory = clientDomainFactory;
    }

    public Client creerClient(int numeroClient, String nom, TypeClient type, String email) {
        return clientDomainFactory.creerClient(numeroClient, nom, type, email);
    }

    public NumeroSoumission creerSoumission(int numeroClient, float heures, List<CodeMateriel> materiels) {
        // TODO
        return null; // TODO
    }

    public void envoyerSoumission(int numeroClient, String numeroSoumission) {
        // TODO
    }
}
