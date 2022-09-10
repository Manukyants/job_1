public class Pufendui extends Hogwarts {

    private int industr;
    private int loyalty;
    private int honesty;

    public Pufendui(String fullName, int magic, int teleport, int industr, int loyalty, int honesty) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.industr = industr;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents (Pufendui studentSecond) {
        int powerOne = this.industr + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industr + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);

        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);

        }
    }

    public int getIndustr() {
        return industr;
    }

    public void setIndustr(int industr) {
        this.industr = industr;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Pufendui{" +
                "industr=" + industr +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
}
