public class Mago extends Personagem{
    public double forca;

    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double forca)
    {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.forca =  forca;
    }

    @Override
    public void usarHabilidadeEspecial()
    {
        System.out.println("Mago " + nome + " ataca com Feitiço de Congelamento!");
    }
}