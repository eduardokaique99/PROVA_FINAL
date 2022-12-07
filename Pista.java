import java.util.ArrayList;

public class Pista {
    
    private int id;
    private NumeroPista<String, String> numero;
    private static ArrayList<Pista> pistas = new ArrayList<>();
    //ATRIBUTOS DA CLASSE

    public Pista(int id, String letras, String numeros) throws Exception {
        this.id = id;
        NumeroPista<String, String> numero = new NumeroPista<>(letras, numeros);
        verificaNumero(numero);
        this.numero = numero;

        setPista(this);
    } // CONSTRUTOR DA CLASSE

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NumeroPista<String, String> getNumero() {
        return numero;
    }

    public void setNumero(NumeroPista<String, String> numero) {
        this.numero = numero;
    }

    public static ArrayList<Pista> getPista() {
        return pistas;
    }

    public static void setPista(Pista pista) {
        pistas.add(pista);
    }

    @Override // USADO PARA LIMPAR 
    public String toString() {
        return "id=" + id + "\n"
            + "numero=" + numero;
    }

    @Override // USADO PARA LIMPAR 
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
    } // VERIFICAÇÃO DA EXISTENCIA PELO ID

    public static boolean verificaNumero(
    NumeroPista<String, String> numero
    ) throws Exception {
        for (Pista pista : pistas) {
            if (pista.getNumero().equals(numero)) {
                throw new Exception("Numero já existe!");
            }
        }
        return true;
    } // VERIFICAÇÃO DA EXISTENCIA DO NUMERO DA PISTA, PARA NÃO SE REPETIR

    public static void excluir(int id) throws Exception {
        Pista pista = getPistaById(id);
        pistas.remove(pista);
    }
}