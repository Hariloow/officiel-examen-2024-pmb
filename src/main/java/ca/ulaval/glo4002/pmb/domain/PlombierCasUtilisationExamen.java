package ca.ulaval.glo4002.pmb.domain;

import java.util.ArrayList;
import java.util.List;

import ca.ulaval.glo4002.pmb.domain.client.Client;
import ca.ulaval.glo4002.pmb.domain.client.ClientDomainFactory;
import ca.ulaval.glo4002.pmb.domain.client.TypeClient;
import ca.ulaval.glo4002.pmb.domain.ne_pas_modifier.CodeMateriel;
import ca.ulaval.glo4002.pmb.domain.ne_pas_modifier.EnvoyeurCourriel;
import ca.ulaval.glo4002.pmb.domain.ne_pas_modifier.Quincaillerie;

// Vous devez compléter cette classe (remplacer les TODO), mais vous ne pouvez pas modifier les signatures (sauf constructeur)
public class PlombierCasUtilisationExamen {
    private final Quincaillerie quincaillerie;
    private final EnvoyeurCourriel envoyeurCourriel;
    private List<Client> clientList;

    public PlombierCasUtilisationExamen(
      Quincaillerie quincaillerie,
      EnvoyeurCourriel envoyeurCourriel
    ) {
        this.quincaillerie = quincaillerie;
        this.envoyeurCourriel = envoyeurCourriel;
        this.clientList = new ArrayList<>();
    }

    public Client creerClient(int numeroClient, String nom, TypeClient type, String email) {
        ClientDomainFactory clientDomainFactory = new ClientDomainFactory();
        Client client = clientDomainFactory.creerClient(numeroClient, nom, type, email);

        clientList.add(client);

        return client;
    }

    public NumeroSoumission creerSoumission(int numeroClient, float heures, List<CodeMateriel> materiels) {
        // TODO
        return null; // TODO
    }

    public void envoyerSoumission(int numeroClient, String numeroSoumission) {
        // TODO
    }
}
