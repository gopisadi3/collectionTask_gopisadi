package Epam_gopisadi.design_pattern;

import java.util.*;


public class main
{
	static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("collections.class");
    public static void main(String[] args) 
    {
    	collections<String> list = new collections<String>();
        int n;
        Scanner sc =new Scanner(System.in);
        Logger.info("Number of Elements");
        n=sc.nextInt();
        int i;
        Logger.info("enter the Elements"+n);
        String s;
        for(i=0;i<n;i++)
        {
        	s=sc.next();
        	list.addele(s);
        	
        }
        Logger.debug("List after adding of elements"+list);
        list.remove(1);
        Logger.debug("List after removing of  elements"+list);

        Logger.debug(list.getvalue(0));

        Logger.debug(list.size());
    }
}