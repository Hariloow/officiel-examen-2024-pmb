package ca.ulaval.glo4002.pmb.domain.client;

import ca.ulaval.glo4002.pmb.domain.Submission;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
    protected final NumeroClient numeroClient;

    protected String nom;
    protected String email;

    protected List<Submission> listOfSubmissions;

    public Client(int numeroClient, String nom, String email) {
        this.numeroClient = NumeroClient.creer(numeroClient);
        this.nom = nom;
        this.email = email;
        listOfSubmissions = new ArrayList<>();
    }

    public void addSubmission(Submission submission) {
        listOfSubmissions.add(submission);
    }
}
