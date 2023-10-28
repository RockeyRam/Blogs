package DesignPattern.Prototype;

public class Runner {

    public void Main()
    {
        Image helmet = new Image(1L,"http://example.com/image/eax3",ImageType.HELMET);
        Image shirt = new Image(2L,"http://example.com/image/eax4",ImageType.SHIRT);
        Image trouser = new Image(3L,"http://example.com/image/eax5",ImageType.TROUSER);
        Image shoe = new Image(4L,"http://example.com/image/eax6",ImageType.SHOE);

        //Coping with constructor approach
        //Player player = new Player("Job",helmet,shirt,trouser,shoe);

        /* player2 object cannot access private fields
        Player player2 = new Player();
        player2.Playername = player.Playername;
        player2.helmat = player.helmat;
        player2.shirt = player.shirt;
        player2.trouser = player.trouser;
        player2.shoe = player.shoe;
        */

        //Create Registry
        Registry registry = new Registry();
        registry.addToRegistry("Player",new Player("Job",helmet,shirt,trouser,shoe));

        //get the player from registry
        Player player = (Player) registry.getRegistry("Player");
        Player clonedPlayer = player.Clone();
        clonedPlayer.Playername = "Jim";

    }
}
