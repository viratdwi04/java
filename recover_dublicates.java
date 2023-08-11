public class Main 
{
    public static void removedublicates(String str,int idx,StringBuilder newstr,boolean map[]) 
    {
        if(idx==str.length())
        {
            System.out.print(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar -'a']==true)
        {
            removedublicates(str,idx+1,newstr,map);
        }
        else
        {
            map[currchar-'a']=true;
            removedublicates(str,idx+1,newstr.append(currchar),map);
        }
    }
    public static void main(String args[])
    {
        String str="viratdwivedi";
        removedublicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}