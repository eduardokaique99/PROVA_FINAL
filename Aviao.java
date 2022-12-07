import java.util.ArrayList;

public class Aviao extends Aeromodelo {

    private PrefixoAviao<String, String> prefixo;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;
    private static ArrayList<Aviao> avioes = new ArrayList<>();
    //ATRIBUTOS DA CLASSE

    public Aviao(int id, String marca, String modelo, String letras, String numeros, int capacidade, int idCompanhia) throws Exception {
        super(id, marca, modelo);
        PrefixoAviao<String, String> prefixo = new PrefixoAviao<>(letras, numeros);
        verificaPrefixo(prefixo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;

        setAviao(this);
    } // CONSTRUTOR DA CLASSE
    
    public PrefixoAviao<String, String> getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(PrefixoAviao<String, String> prefixo) {
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

    public static ArrayList<Aviao> getAviao() {
        return avioes;
    }

    public static void setAviao(Aviao aviao) {
        avioes.add(aviao);
    }

    @Override // USADO PARA LIMPAR 
    public String toString() {
        return super.toString() 
            + "\nprefixo=" + prefixo
            + "\ncapacidade=" + capacidade
            + "\nidCompanhia=" + idCompanhia + "\n";
    }

    public static Aviao getAviaoById(int id) throws Exception {
        for (Aviao aviao : avioes) {
            if (aviao.getId() == id) {
                return aviao;
            }
        }
        throw new Exception("Avião não encontrado");
    } // VERIFICAÇÃO DA EXISTENCIA PELO ID

    public static boolean verificaPrefixo(
        PrefixoAviao<String, String> prefixo
    ) throws Exception {
        for (Aviao aviao : avioes) {
            if (aviao.getPrefixo().equals(prefixo)) {
                throw new Exception("Prefixo já existe!");
            }
        }
        return true;
    } // VERIFICAÇÃO DA EXISTENCIA DO PREFIXO, PARA NÃO SE REPETIR

    public static void excluir(int id) throws Exception {
        Aviao aviao = getAviaoById(id);
        avioes.remove(aviao);
    }
}