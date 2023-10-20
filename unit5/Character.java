public class Character {
    
    private String name;
    private String typeChar; // is this character a royal, peasant, warrior, troll, wizard, dragon, fairy, or animal
    private int health;
    
    public Character(String initName, String initTypeChar, int initHealth)
    {
        name = initName;
        typeChar = initTypeChar;
        health = initHealth;
    }
    
    // Getters
    
    public String getName()
    {
        return name;
    }
    
    public String getTypeChar()
    {
        return typeChar;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    // Setters
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    
    // toString()

    public String toString()
    {
        return name + " is a member of the character class and is a(n) " + typeChar +".";
    }
    
    public static void main(String args[]) {
      Character nicholas = new Character("Nicholas", "Warrior", 100);
      //nicholas.setName("Nick");
      //System.out.println(nicholas.getName());
      System.out.println(nicholas);
      
    }
}
