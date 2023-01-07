public class MyCompany 
{
    public static void main(String[] args) 
    {
        Manager[] managers = new Manager[]{
            new Manager("Ishrat", "Sikder", "6478596348", "04232002", 2017, 60000, 15, 9, 170),
            new Manager("Janvi", "Balani", "4168593210", "06122001", 2013, 100000, 25, 20, 270),
            new Manager("Umair", "Hossain", "5198527452", "12102002", 2010, 150000, 35, 15, 390),
        };
        Employee[] employees = new Employee[]{
            new Employee("John", "Palvo", "5192497402", "02231996", 2013, 85000, 25, 23),
            new Employee("Lydia", "Stoveer", "2269630258", "05031992", 2014, 80000, 24, 18),
            new Employee("Sam", "Palex", "1238567890", "10101970", 2016, 75000, 30, 23),
            new Employee("Jessica", "Singh", "4731679450", "08092003", 2012, 120000, 40, 26),
            new Employee("Shane", "Mcmahon", "2213630258", "05121999", 2012, 78000, 30, 16),
            new Employee("Shane", "Smith", "1238567890", "11101990", 2018, 55000, 20, 19),
            new Employee("Samia", "Jahan", "4731209450", "06112003", 2015, 90000, 22, 20)
        };
        Company company = new Company("Samsan Tech", 2010, managers, employees);

        System.out.println("\nThe following is the information of the company and its managers & other employees:");
        System.out.println(company.toString());
    }
}
