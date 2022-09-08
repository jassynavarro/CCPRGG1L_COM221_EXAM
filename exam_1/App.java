public class App {
    public static void main(String[] args) {

        Student My = new Student();

        My.surname = "Navarro";
        My.firstName = "Jascent";
        My.middleInitial = 'G';
        My.dateOfBirth = 07/23/2004;
        My.studentNumber = 2022101538;
        My.studentEmailAddress = "navarrojg@students.national-u.edu.ph";
        My.iAmAwesome = true;
        My.sayMyStudentNumber();
        My.sayMyEmailAddress();
        My.amIAwesome();
    }
}
