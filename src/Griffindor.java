public class Griffindor extends Hogwarts {
    private int honor;
    private int nobility;
    private int bravery;

    public void compareStudents (Griffindor studentSecond) {
        int powerOne = this.honor + this.bravery + this.nobility;
        int powerTwo = studentSecond.honor + studentSecond.nobility + studentSecond.bravery;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);

        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);

        }
    }

    public Griffindor(String fullName, int magic, int teleport, int honor, int nobility, int bravery) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "honor=" + honor +
                ", nobility=" + nobility +
                ", bravery=" + bravery +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
}
