

public class CharacterGame {
    private int currentHealth;
    private String name;
    private String status;

    public CharacterGame(int currentHealth, String name) {
        setName(name);
        setCurrentHealth(currentHealth);
    }

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
        }

        if (this.currentHealth > 0) {
            status = "alive";
        } else {
            status = "dead";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }


    public String getStatus() {
        return status;
    }

    public void takeDamage(int damageAmount) {
        if (damageAmount < 0) return;
        setCurrentHealth(currentHealth-damageAmount);
    }

    public void receiveHealing(int healingAmount){
        if (healingAmount < 0) return;
        setCurrentHealth(currentHealth+healingAmount);
    }

}
