import java.util.ArrayList;

public class Pista {
    
    private int id;
    private String numero;

    private static ArrayList<Pista> pistas = new ArrayList<>();

    public Pista(int id, String numero) {
        this.id = id;
        this.numero = numero;

        setPista(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static ArrayList<Pista> getPista() {
        return pistas;
    }

    public static void setPista(Pista pista) {
        pistas.add(pista);
    }

    @Override
    public String toString() {
        return "id=" + id + "\n"
            + "numero=" + numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pista) {
            Pista pista = (Pista) obj;
            return pista.getId() == this.getId();
        }
        return false;
    }

    public static Pista getPistaById(int id) throws Exception {
        for (Pista pista : pistas) {
            if (pista.getId() == id) {
                return pista;
            }
        }
        throw new Exception("Pista não encontrada");
    }

    public static void excluir(int id) throws Exception {
        Pista pista = getPistaById(id);
        pistas.remove(pista);
    }
    
}

