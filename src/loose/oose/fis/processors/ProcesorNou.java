package loose.oose.fis.processors;

import loose.oose.fis.documents.Document;

import java.util.ArrayList;

class ProcesorNou implements Procesor
{
    private String text;

    public ProcesorNou(String text) {
        this.text = text;
    }

    @Override
    public int proceseaza(ArrayList<Document> documente) {
        int rez = 0;

        for (Document document : documente) {
            String[] continut = document.analizeaza();
            for (String cuvant : continut) {
                if (cuvant.equals(text)) {
                    rez++;
                }
            }
        }

        return rez+" modificare facuta de Tania\n";
    }
}