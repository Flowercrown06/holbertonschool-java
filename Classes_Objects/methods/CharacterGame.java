
public class CharacterGame {
    private int currentHealth;
    private String name;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        if (currentHealth < 0) {
            this.currentHealth = 0;
        } else if (currentHealth > 100) {
            this.currentHealth = 100;
        } else {
            this.currentHealth = currentHealth;
        }    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damageAmount) {
        if (damageAmount < 0) return;
        currentHealth -= damageAmount;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void receiveHealing(int healingAmount){
        if (healingAmount < 0) return;
        currentHealth += healingAmount;
        if (currentHealth > 100) {
            currentHealth = 100;
        }
    }

}
