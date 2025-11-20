import java.io.*;
import java.util.*;
public class exampleprop {
    public static void main(String args[])throws IOException

{
 File fp=new File("./property.properties");
 if(!fp.exists())
 {
    fp.createNewFile();
 }    
Properties prop=new Properties();
FileReader fr=new FileReader(fp);  //this for if in case when we update the values of then new values will be stored and entire data will be lost
                                   //in order to overcome that we are usinf fileinputstreamreader

prop.load(fr);
fr.close();
FileOutputStream fos=new FileOutputStream(fp);
prop.setProperty("url","localhost");
prop.setProperty("userName", "chandu");

prop.setProperty("password","256");
prop.store(fos,"Database related");  //store writes only the current Properties object to the file.
Set<Map.Entry<Object,Object>>keys=prop.entrySet();
System.out.println(keys);
Collection<Object>val=prop.values();
System.out.println(val);
fos.close();


}
}   

