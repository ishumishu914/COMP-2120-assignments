public class CourseGradesDemo 
{
    public static void main(String[] args) 
    {
        CourseGrades grades = new CourseGrades();

        GradedActivity lab = new GradedActivity();
        lab.setScore(85.0); 
        grades.setLab(lab);

        PassFailExam exam = new PassFailExam(20, 20, 40);
        exam.setScore(85.0);
        grades.setPassFailExam(exam);

        GradedActivity essay = new GradedActivity();
        essay.setScore(80.0);
        grades.setEssay(essay);

        FinalExam finalExam = new FinalExam(20, 4);
        //finalExam.setScore(80.0);
        grades.setFinalExam(finalExam);
        
        System.out.println(grades.toString());
        System.out.println("Average Score: " + grades.getAverage());
        System.out.println("Highest Score: " + grades.getHighest().getScore());
        System.out.println("Lowest Score: " + grades.getLowest().getScore());
                  
    }
}
