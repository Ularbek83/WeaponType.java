public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        weapon.setType(WeaponType.MAGIC);
        weapon.setWeaponTypeName("MAGIC");

        boss.setWeapon(weapon);
        boss.setDeffence("Balta");
        boss.setHealth(100);
        boss.printInfo();


        Weapon weapon1 = new Weapon();
        weapon1.setType(WeaponType.MAGIC);
        weapon1.setWeaponTypeName("MAGIC");

        Skeleton skeleton = new Skeleton();
        skeleton.setArrowCount(100);
        skeleton.setDeffence("Balta");
        skeleton.setHealth(100);
        skeleton.setWeapon(weapon1);
        skeleton.setDamage(100);
        skeleton.printInfo();

        Weapon weapon2 = new Weapon();
        weapon2.setType(WeaponType.FIGHTER);
        weapon2.setWeaponTypeName("FIGHTER");

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setArrowCount(100);
        skeleton2.setDeffence("Balta");
        skeleton2.setHealth(100);
        skeleton2.setWeapon(weapon2);
        skeleton2.setDamage(100);
        skeleton2.printInfo();
    }
}