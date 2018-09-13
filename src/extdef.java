
import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileSystemView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ok
 */
public class extdef extends FileFilter{

boolean find =false;
    public boolean accept(File f) {
        if(f.isDirectory()){
return true;}
        String er = f.getName();
       int pk=er.lastIndexOf('.');
String e =null;
               e= er.substring(pk+1).toLowerCase();
       
       if(e.equals("txt")){return true ;}
       
    
       else {
           return false;}
       }          
    public String getDescription() {
return "text Document(.txt)";
    }
    
}
class sj extends FileSystemView{

    @Override
    public File createNewFolder(File containingDir) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}