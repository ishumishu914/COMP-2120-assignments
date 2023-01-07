import java.util.ArrayList;

public class Myfriends 
{
    public static void main(String[] args) 
    {
        FriendsList friends = new FriendsList();
        Person[] people = new Person[] {
            new Person("Ishrat", "Sikder", "6478596348", "04232002"), //DOB m-d-y
            new Person("Janvi", "Balani", "4168593210", "06122001"),
            new Person("Umair", "Hossain", "5198527452", "12102002"),
            new Person("Shane", "Mcmahon", "2269630258", "05121999"),
            new Person("Shane", "Smith", "1238567890", "11101990"),
            new Person("Nusrat", "Jahan", "4731679450", "06112003")
        };

        //add
        for (int i = 0; i < people.length; i++) 
        {
            friends.addFriend(people[i]);
        }
        
        //print all friends
        System.out.print(friends.toString());

        //modify 
        friends.modifyFriend(1, "cell num", "4168520147");
        friends.modifyFriend(2, "first name", "Khalid");

        //delete
        friends.removeFriend(people[1]);

        //print all friends
        System.out.print("List after modifications:\n" + friends.toString());

        ArrayList<Person> p = new ArrayList<Person>();
        for (int i = 0; i < people.length; i++) 
        {
            p.add(people[i]);   
        }

        //size
        System.out.println("Total number of friends in list: " + friends.friendsSize(p));

        //print sorted list by last name
        System.out.println("\nFriends list sorted by last name:- ");
        friends.sortLastName(p);
        System.out.println(p);

        //print sort list by birth month (by last name)
        System.out.println("\nFriends list sorted by last name according to birth month:- ");
        friends.sortBirthMonthLastName(p);
        System.out.println(p);

        //print sort list by birth date of a month (by last name)
        System.out.println("\nFriends list sorted by last name according to birth day:- ");
        friends.sortBirthDayLastName(p);
        System.out.println(p);

        //find cell num, given full name
        System.out.println("\nCell number of Ishrat Sikder is " + friends.getCellNum("Ishrat", "Sikder"));
        System.out.println("Cell number of Khalid Hossain is " + friends.getCellNum("Khalid", "Hossain"));

        //remove all friends with first name Shane from Friendslist object's copy
        FriendsList newfList = new FriendsList(friends); //friends is no longer the original Poeple[], it's the modified one

        for (int i = 0; i < people.length; i++) 
        {
            if (people[i].getFirstName() == "Shane") 
            {
                newfList.removeFriend(people[i]);        
            }
        }
        System.out.println("\nFriends named Shane removed. Here is the new list:-");
        System.out.println(newfList.toString());
    }
}
