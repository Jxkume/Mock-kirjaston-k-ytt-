public class FakeHinnoittelija implements IHinnoittelija {
    private float alennus;

    public FakeHinnoittelija(float alennus) {
        this.alennus = alennus;
    }

    @Override
    public float getAlennusProsentti(Asiakas asiakas, Tuote tuote) {
        return alennus;
    }

    @Override
    public void aloita() {
        System.out.println("Käynistetään ohjelmaa...");
    }

    @Override
    public void lopeta() {
        // Implementation for ending the pricing process
        System.out.println("Lopetetaan ohjelmaa...");
    }

    @Override
    public void setAlennusProsentti(Asiakas asiakas, float alennusProsentti) {
        this.alennus = alennusProsentti;	
    }
}
