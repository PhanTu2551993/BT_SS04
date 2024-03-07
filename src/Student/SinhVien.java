package Student;

public class SinhVien {
    private String school;
    private String mssv;
    private String name;
    private String age;
    private String sex;
    public SinhVien (){}

    public SinhVien(String school, String mssv, String name, String age, String sex) {
        this.school = school;
        this.mssv = mssv;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void displayData(){
        System.out.println("SinhVien{" +
                "school='" + school + '\'' +
                ", mssv='" + mssv + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}');
    }
}



