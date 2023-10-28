package DesignPattern.Prototype;

public class Player implements ICloneable{
    public Player(){}
    public Player(String player, Image helmet, Image shirt, Image trouser, Image shoe) {
        Playername = player;
        Helmet = helmet;
        Shirt = shirt;
        Trouser = trouser;
        Shoe = shoe;
    }

    public String Playername;
    private Image Helmet;
    private Image Shirt;
    private Image Trouser;
    private Image Shoe;

    public void Sprint()
    {
        System.out.println("Sprint");
    }

    public void Shoot()
    {
        System.out.println("Shoot");
    }

    public void Peek()
    {
        System.out.println("Peek");
    }

    public void Reload()
    {
        System.out.println("Reload");
    }

    @Override
    public Player Clone() {
        Player clone = new Player();
        clone.Playername = this.Playername;
        clone.Helmet = this.Helmet;
        clone.Shirt = this.Shirt;
        clone.Trouser = this.Trouser;
        clone.Shoe = this.Shoe;

        return clone;
    }
}
