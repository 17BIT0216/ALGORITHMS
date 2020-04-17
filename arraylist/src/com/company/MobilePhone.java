package com.company;

import java.util.ArrayList;

public class MobilePhone {

    public String num;

    ArrayList<Contacts> mycontact=new ArrayList<Contacts>();


    public MobilePhone(String num) {
        this.num = num;

    }

    public boolean addContact(Contacts contact)
    {
        if(findContact(contact.getName()) >= 0)          //find whether it is in array list or not
        {
            System.out.println("Already there");
            return false;
        }
        else
        {
            mycontact.add(contact);
            return true;

        }
    }

    private int findContact(Contacts contact)
    {
        return this.mycontact.indexOf(contact);
    }

    private int findContact(String str)
    {
        for(int i=0;i<this.mycontact.size();i++)
        {
            Contacts contact=mycontact.get(i);
            if(contact.getName().equals(str))
                return i;
        }
        return -1;
    }

    public boolean updateContact(Contacts old,Contacts newcontact)
    {
      if(mycontact.indexOf(old)>=0)
      {
          int pos=findContact(old);
          System.out.println("older contact found and it can be updated now");
          mycontact.set(pos,newcontact);
          System.out.println("old contact was replaced with new");
          return true;

      }
      else
      {
          System.out.println("We were not able to find your conact");
          return false;
      }

    }

    public boolean removeContact(Contacts contact)
    {
        if(findContact(contact)>=0)
        {
        int pos=findContact(contact);
        mycontact.remove(pos);
            System.out.println("removed succesfully"
            );
            return true;
        }
        else
        {
            System.out.println("Contact not found  the contact list");
            return false;
        }
    }


}
