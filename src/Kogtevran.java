public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creator;

    public Kogtevran(String fullName, int magic, int teleport, int mind, int wisdom, int wit, int creator) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creator = creator;
    }

    public void compareStudents (Kogtevran studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit + this.creator;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creator;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " ������� ��� " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " ������� ��� " + this.fullName);

        } else {
            System.out.println(this.fullName + " ����� �� �������, ��� " + studentSecond.fullName);

        }
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreator() {
        return creator;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creator=" + creator +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
}
