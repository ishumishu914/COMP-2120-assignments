import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class FriendsList  
{
    private ArrayList<Person> friends;

    public FriendsList() 
    {
        friends = new ArrayList<Person>();
    }

    public ArrayList<Person> getFriendsList()
    {
        return new ArrayList<Person>(friends);
    }

    public FriendsList(FriendsList f)
    {
        friends = f.getFriendsList();
    }
        
    public void addFriend(Person p) 
    {
        friends.add(p);
    }

    public void removeFriend(Person p)
    {
        friends.remove(p);
    }

    //check what component of friend's information is being changed
    public void modifyFriend(int i, String change, String output)
    {
        if(change == "first name")
        {
            friends.get(i).setFirstName(output);
        }
        else if (change == "last name") 
        {
            friends.get(i).setLastName(output);    
        }
        else if (change == "cell num") 
        {
            friends.get(i).setCellNum(output);    
        }
        else if(change == "birth date")
        {
            friends.get(i).setBirthDate(output);
        }
    }

    public void sortLastName(ArrayList<Person> p)
    {
        Collections.sort(p, new Comparator<Person>() 
        {
            public int compare(Person p1, Person p2)
            {
                int res = p1.getLastName().compareToIgnoreCase(p2.getLastName());
                if (res != 0) //if the last names are not equal
                {
                    return res;    
                }
                return p1.getFirstName().compareToIgnoreCase(p2.getFirstName()); //if last names are same
            }
        });
    }

    public int friendsSize(ArrayList<Person> f)
    {
        return f.size();
    }

    public void sortBirthMonthLastName(ArrayList<Person> p)
    {
        Collections.sort(p, new Comparator<Person>()
        {
            public int compare(Person p1, Person p2)
            {
                Integer person1 = Integer.parseInt(p1.getBirthDate().substring(0, 2)); //for months
                Integer person2 = Integer.parseInt(p2.getBirthDate().substring(0, 2));
                Integer person1_ = Integer.parseInt(p1.getBirthDate().substring(2, 4)); //for days
                Integer person2_ = Integer.parseInt(p2.getBirthDate().substring(2, 4));
                int res =  Integer.compare(person1, person2);
                if (res == 0) //if 2 people have same birth month, sort by birth days
                {
                    return person1_ - person2_;
                } 
                else //if not sort my order of months
                {
                    return person1 - person2;            
                }
            }
        });
    }

    public void sortBirthDayLastName(ArrayList<Person> p)
    {
        Collections.sort(p, new Comparator<Person>()
        {
            public int compare(Person p1, Person p2)
            {
                Integer person1 = Integer.parseInt(p1.getBirthDate().substring(2, 4));
                Integer person2 = Integer.parseInt(p2.getBirthDate().substring(2, 4));
                int res = Integer.compare(person1, person2);
                if (res == 0) //if 2 people were born on same day of whatever month (not neccessarily same month)
                {
                    return p1.getLastName().compareToIgnoreCase(p2.getLastName());
                } 
                else //otherwise sort by last names days only (would automatically be last name based since order of the day is considered)
                {
                    return person1 - person2;
                }
            }
        });
    }

    public String getCellNum(String firstname, String lastname )
    {
        boolean found = false;
        String cellNum = null;

        //check nme of person to give cell number
        for (int i = 0; i < friends.size(); i++) 
        {
            if (friends.get(i).getFirstName() == firstname && friends.get(i).getLastName() == lastname) 
            {
                found =true;
                cellNum = friends.get(i).getCellNum();            
            }
    
        }
        if (found == false)
        {
            System.err.println("Wrong name!");
            cellNum = "does not exist..";
        } 
        return cellNum;
    }

    public String toString()
    {
        String s = "";
        for (int i = 0; i < friends.size(); i++) 
        {
            s += (friends.get(i).toString());
        }
        return s;
    }
}
