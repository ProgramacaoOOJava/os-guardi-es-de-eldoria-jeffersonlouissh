public class Main {
    public static void main(String[] args) {
        Personagem[] heroes = {
            new Guerreiro("Arthus", 10, 1, 100, 10.5),
            new Mago("Albus", 9, 5, 80, 12.5)
        };
        
        for(Personagem p : heroes){
            p.usarHabilidadeEspecial();
        }

    }
}
