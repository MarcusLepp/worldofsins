package WorldOfStrategy;

public abstract class Hero {

	
	public String name;
	private double damage;
	private double armor;
	private double health;
	private double healing;
	private double healthReg;
	private double crit;
	private double dodge;
	private double attackSpeed;
	
	

	public Hero(String name, double damage, double armor, double health, double healing, double healthReg, double crit,
			double dodge, double attackSpeed) {
		
		this.name = name;
		this.damage = damage;
		this.armor = armor;
		this.health = health;
		this.healing = healing;
		this.healthReg = healthReg;
		this.crit = crit;
		this.dodge = dodge;
		this.attackSpeed = attackSpeed;

	}

	public double getHealing() {
		return healing;
	}

	public void setHealing(double healing) {
		this.healing = healing;
	}

	public double getHealthReg() {
		return healthReg;
	}

	public void setHealthReg(double healthReg) {
		this.healthReg = healthReg;
	}

	public double getCrit() {
		return crit;
	}

	public void setCrit(double crit) {
		this.crit = crit;
	}

	public double getDodge() {
		return dodge;
	}

	public void setDodge(double dodge) {
		this.dodge = dodge;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	


}
