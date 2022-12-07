import java.util.ArrayList;

public class Helicoptero extends Aeromodelo {
        
        private String cor;
        private int capacidade;
        private static ArrayList<Helicoptero> helicopteros = new ArrayList<>();
        //ATRIBUTOS DA CLASSE
    
        public Helicoptero(int id, String marca, String modelo, String cor, int capacidade) {
            super(id, marca, modelo);
            this.cor = cor;
            this.capacidade = capacidade;

            setHelicoptero(this);
        } // CONSTRUTOR DA CLASSE

        public String getCor() {
            return cor;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }
    
        public static ArrayList<Helicoptero> getHelicoptero() {
            return helicopteros;
        }
    
        public static void setHelicoptero(Helicoptero helicoptero) {
            helicopteros.add(helicoptero);
        }
    
        @Override // USADO PARA LIMPAR 
        public String toString() {
            return super.toString() 
                + "\ncapacidade=" + capacidade
                + "\ncor=" + cor + "\n";
        }
    
        public static Helicoptero getHelicopteroById(int id) throws Exception {
            for (Helicoptero helicoptero : helicopteros) {
                if (helicoptero.getId() == id) {
                    return helicoptero;
                }
            }
            throw new Exception("Helicoptero não encontrado");
        } // VERIFICAÇÃO DA EXISTENCIA PELO ID

    
        public static void excluir(int id) throws Exception {
            Helicoptero helicoptero = getHelicopteroById(id);
            helicopteros.remove(helicoptero);
        }
    }