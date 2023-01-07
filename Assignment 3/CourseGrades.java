public class CourseGrades implements Analyzable
{
   private GradedActivity[] grades = new GradedActivity[4];

   public CourseGrades()
   {
      GradedActivity[] grades = new GradedActivity[4];
   }

   public void setLab(GradedActivity lab)
   {
      grades[0] = lab;
   }

   public void setPassFailExam(PassFailExam PassFailExam)
   {
      grades[1] = PassFailExam;
   }

   public void setEssay(GradedActivity Essay)
   {
      grades[2] = Essay;
   }

   public void setFinalExam(FinalExam FinalExam)
   {
      grades[3] = FinalExam;
   }

   public double getAverage()
   {
      double average = (grades[0].getScore() + grades[1].getScore() + grades[2].getScore() + grades[3].getScore()) / (double) 4;
      return average;
   }

   public GradedActivity getHighest()
   {
      GradedActivity max = grades[0];
      for (int i = 1; i < grades.length; i++) 
      {
         if (grades[i].getScore() > max.getScore()) 
         {
            max = grades[i];
         }
      }
      return max; 
   }

   public GradedActivity getLowest()
   {
      GradedActivity min = grades[0];
      for (int i = 1; i < grades.length; i++) 
      {
         if (grades[i].getScore() < min.getScore()) 
         {
            min = grades[i];
         }
      }
      return min;
   }

   public String toString() 
   {
      String str = "\nLab Score: " + grades[0].getScore() + "\t\tGrade: " + grades[0].getGrade() +
                  "\nPass/Fail Exam Score: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade() +
                  "\nEssay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade() +
                  "\nFinal Exam Score: " + grades[3].getScore() + "\t\tGrade: " + grades[3].getGrade();
      return str;
   }
}