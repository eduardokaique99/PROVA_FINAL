import java.util.ArrayList;

public class Voo {

    private int id;
    private NumeroVoo<String, String> numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idPista;
    private Pista pista;
    private int idAviao;
    private Aviao aviao;
    private int idHelicoptero;
    private Helicoptero helicoptero;
    private int idJato;
    private Jato jato;
    private static ArrayList<Voo> voos = new ArrayList<>();
    //ATRIBUTOS DA CLASSE

    public Voo(int id, String letras, String numeros, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int idAviao, Aviao aviao, int idHelicoptero, Helicoptero helicoptero, int idJato, Jato jato) throws Exception {
        this.id = id;
        NumeroVoo<String, String> numero = new NumeroVoo<>(letras, numeros);
        verificaNumero(numero);
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idPista = idPista;
        this.pista = pista;
        this.idAviao = idAviao;
        this.aviao = aviao;
        this.idHelicoptero = idHelicoptero;
        this.helicoptero = helicoptero;
        this.idJato = idJato;
        this.jato = jato;

        setVoo(this);
    } // CONSTRUTOR DA CLASSE

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NumeroVoo<String, String> getNumero() {
        return numero;
    }

    public void setNumero(NumeroVoo<String, String> numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setTipo(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setTamanho(String hora) {
        this.hora = hora;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public void setIdHelicoptero(int idHelicoptero) {
        this.idHelicoptero = idHelicoptero;
    }

    public void setHelicoptero(Helicoptero helicoptero) {
        this.helicoptero = helicoptero;
    }

    public void setIdJato(int idJato) {
        this.idJato = idJato;
    }

    public void setJato(Jato jato) {
        this.jato = jato;
    }

    public static void setVoo(Voo voo) {
        voos.add(voo);
    }

    public static ArrayList<Voo> getVoo() {
        return voos;
    }

    @Override // USADO PARA LIMPAR 
    public String toString() {
        return "id=" + id + "\n" 
             + "numero=" + numero + "\n"
             + "data=" + data + "\n"
             + "hora=" + hora + "\n"
             + "origem=" + origem + "\n"
             + "destino=" + destino + "\n"
             + "piloto=" + piloto + "\n"
             + "copiloto=" + copiloto + "\n"
             + "observacao=" + observacao + "\n";
    }

    @Override // USADO PARA LIMPAR 
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Voo)) {
            return false;
        }
        Voo voo = (Voo) obj;

        
        if (this.getId() == voo.getId()) {
            return true;
        }

        return false;
    }    

    public static Voo getVagaById(int id) throws Exception {
        for (Voo voo : voos) {
            if (voo.getId() == id) {
                return voo;
            }
        }
        throw new Exception("Voo não encontrada");
    } // VERIFICAÇÃO DA EXISTENCIA PELO ID

    public static boolean verificaNumero(
    NumeroVoo<String, String> numero
    ) throws Exception {
        for (Voo voo : voos) {
            if (voo.getNumero().equals(numero)) {
                throw new Exception("Numero já existe!");
            }
        }
        return true;
    } // VERIFICAÇÃO DA EXISTENCIA DO NUMERO DO VOO, PARA NÃO SE REPETIR

    public static void excluir(int id) throws Exception {
        Voo voo = getVagaById(id);
        voos.remove(voo);
    }
}