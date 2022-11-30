import java.util.ArrayList;

public class Aviao extends Aeromodelo {

    private String prefixo;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;

    private static ArrayList<Aviao> avioes = new ArrayList<>();

    public Aviao(int id, String marca, String modelo, String prefixo, int capacidade, int idCompanhia) {
        super(id, marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;

        setAviao(this);
    }
    
    public String getPrefixo() {
        return prefixo;
    }

    public void setMarca(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getIdCapacidade() {
        return idCompanhia;
    }

    public void setIdCapacidade(int idCompanhia) {
        this.idCompanhia = idCompanhia;
    }

    public static ArrayList<Aviao> getBicicletas() {
        return avioes;
    }

    public static void setAviao(Aviao aviao) {
        avioes.add(aviao);
    }

    @Override
    public String toString() {
        return super.toString() 
            + "\nprefixo=" + prefixo
            + "\ncapacidade=" + capacidade
            + "\nidCompanhia=" + idCompanhia + "\n";
    }

    public static Aviao getBicicletaById(int id) throws Exception {
        for (Aviao aviao : avioes) {
            if (aviao.getId() == id) {
                return aviao;
            }
        }
        throw new Exception("Bicicleta não encontrada");
    }

    public static void excluir(int id) throws Exception {
        Aviao aviao = getBicicletaById(id);
        avioes.remove(aviao);
    }
}
