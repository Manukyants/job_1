public class Sliziren extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resour;
    private int lustForPower;

    public Sliziren(String fullName, int magic, int teleport, int cunning, int determination, int ambition, int resour, int lustForPower) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resour = resour;
        this.lustForPower = lustForPower;
    }

    public void compareStudents (Sliziren studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambition + this.resour + this.lustForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambition + studentSecond.resour + studentSecond.lustForPower;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResour() {
        return resour;
    }

    public void setResour(int resour) {
        this.resour = resour;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Sliziren{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resour=" + resour +
                ", lustForPower=" + lustForPower +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
}
