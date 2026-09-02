public class ProgramaDeTV
{
    private int episodios;
    private int dias;

    public int getEpisodios()
    {
        return episodios;
    }

    public void setEpisodios(int episodios)
    {
        this.episodios = episodios;
    }

    public int getDias()
    {
        return dias;
    }

    public void setDias(int dias)
    {
        this.dias = dias;
    }

    public int resultado()
    {
        return episodios / dias;
    }
}
