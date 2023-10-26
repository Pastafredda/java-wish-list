package org.lessons.java;

public class Regalo {

    private String destinatario;
    private String descrizione;

    public Regalo(String descrizione, String destinatario) {
        this.descrizione = descrizione;
        this.destinatario= destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public String toString() {
        return "Regalo{" +
                "descrizione='" + descrizione + '\'' +
                ", destinatario='" + destinatario + '\'' +
                '}';
    }
}
