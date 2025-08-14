package methods;
public class CharacterGame {
    private int currentHealth;
    private String name;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damageAmount){
        currentHealth-=damageAmount;
    }

    public void receiveHealing(int healingAmount){
        currentHealth+=healingAmount;
    }

}
