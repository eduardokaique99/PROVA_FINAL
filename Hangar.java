import java.util.ArrayList;

public class Hangar {

    private int id;
    private String local;
    private int idAviao;
    private Aviao aviao;

    private static ArrayList<Hangar> hangars = new ArrayList<>();

    public void Companhia(int id, String local, int idAviao, Aviao aviao) {
        this.id = id;
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = aviao;

        setHangar(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return local;
    }

    public void setNome(String local) {
        this.local = local;
    }

    public int getIdAviao() {
        return idAviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public static ArrayList<Hangar> getHangar() {
        return hangars;
    }

    public static void setHangar(Hangar hangar) {
        hangars.add(hangar);
    }

    @Override
    public String toString() {
        return "id=" + id + "\n"
            + "local=" + local + "\n"
            + "idAviao=" + idAviao + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hangar) {
            Hangar hangar = (Hangar) obj;
            return hangar.getId() == this.getId();
        }
        return false;
    }

    public static Hangar getHangarById(int id) throws Exception {
        for (Hangar hangar : hangars) {
            if (hangar.getId() == id) {
                return hangar;
            }
        }
        throw new Exception("Hangar não encontrada");
    }

    public static void excluir(int id) throws Exception {
        Hangar hangar = getHangarById(id);
        hangars.remove(hangar);
    }
    
}
