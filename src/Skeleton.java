public class Skeleton extends Boss {
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public void printInfo() {
        System.out.println("Skeleton: Weapon" + super.getWeapon().getWeaponTypeName() + " type " + super.getWeapon().getType().toString() + " arrowCount: " + arrowCount);
    }
}
