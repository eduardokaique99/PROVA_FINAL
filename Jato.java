import java.util.ArrayList;

public class Jato extends Aeromodelo {

        private int velocidade;
        private String cor;
    
        private static ArrayList<Jato> jatos = new ArrayList<>();
    
        public Jato(int id, String marca, String modelo) {
            super(id, marca, modelo);
            this.velocidade = velocidade;
            this.cor = cor;

            setJato(this);
        }

        public int getVelocidade() {
            return velocidade;
        }
    
        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }

        public String getCor() {
            return cor;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }

        public static ArrayList<Jato> getJato() {
            return jatos;
        }
    
        public static void setJato(Jato jato) {
            jatos.add(jato);
        }
    
        @Override
        public String toString() {
            return super.toString() 
                + "\nvelocidade=" + velocidade
                + "\ncor=" + cor + "\n";
        }
    
        public static Jato getMotoById(int id) throws Exception {
            for (Jato jato : jatos) {
                if (jato.getId() == id) {
                    return jato;
                }
            }
            throw new Exception("Moto não encontrada");
        }
    
        public static void excluir(int id) throws Exception {
            Jato jato = getMotoById(id);
            jatos.remove(jato);
        }
    }