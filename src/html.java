
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
public class html extends FileFilter{

boolean find =false;
    public boolean accept(File f) {
        if(f.isDirectory()){
return true;}
        String er = f.getName();
       int pk=er.lastIndexOf('.');
String e =null;
               e= er.substring(pk+1).toLowerCase();
       
       if(e.equals("html")){return true ;}
       
    
       else {
           return false;}
       }          
    public String getDescription() {
return "HTML Document(.html)";
    }
    
}