import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
  public static void writepoemToaFile(String fileName, String balled) throws IOException{
    byte[]
            mydata = balled.getBytes();
    FileOutputStream fileOutputStream=new FileOutputStream(fileName,true);
    fileOutputStream.write(mydata);
  }
  public static void main(String[]args)throws IOException {
    String balled ="'Twas the night before Christmas, when all through the house\n" +
            "Not a creature was stirring, not even a mouse;\n" +
            "The stockings were hung by the chimney with care,\n" +
            "In hopes that St. Nicholas soon would be there;\n" +
            "\n" +
            "The children were nestled all snug in their beds,\n" +
            "While visions of sugar-plums danced in their heads;\n" +
            "And mamma in her 'kerchief, and I in my cap,\n" +
            "Had just settled down for a long winter's nap,\n" +
            "\n" +
            "When out on the lawn there arose such a clatter,\n" +
            "I sprang from the bed to see what was the matter.\n" +
            "Away to the window I flew like a flash,\n" +
            "Tore open the shutters and threw up the sash.\n";
            writepoemToaFile("C:\\Users\\nithi\\Desktop\\NIIT Home Work\\WriteToAFile.txt",balled);
  }
    }

