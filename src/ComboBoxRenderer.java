
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;




 public class ComboBoxRenderer  implements ListCellRenderer
{


    private Color[] colors;
    private String[] strings;
JComboBox combo;
    //JPanel textPanel;
    JLabel text;

    public ComboBoxRenderer(JComboBox combo) {
this.combo=combo;

   //  textPanel = new JPanel();
      
        text = new JLabel();
        text.setOpaque(true);
        text.setFont(combo.getFont());

    }

    public void setColors(Color[] col)
    {
        colors = col;
    }

    public void setStrings(String[] str)
    {
        strings = str;
    }

    public Color[] getColors()
    {
        return colors;
    }

    public String[] getStrings()
    {
        return strings;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value,
 
            int index, boolean isSelected, boolean cellHasFocus) {

 
if(isSelected){
    
text.setBackground(list.getSelectionBackground());

combo.setBackground(colors[list.getSelectedIndex()]);
combo.setForeground(colors[list.getSelectedIndex()]);

}else{
text.setBackground(Color.WHITE);
}

        if (colors.length != strings.length)
        {
          
           // return this;
        }
        else if (colors == null)
        {
          
           // return this;
        }
        else if (strings == null)
        {
            
          
            
            //return this;
        }

        //text.setBackground(getBackground());

        
         text.setText(value.toString());
        if (index>-1) {
       
            text.setToolTipText("set font color to "+ strings[index].toLowerCase());
        text.setForeground(colors[index]);
     
        }else{
      
        }
        
        
        return text ; 
        
    }

   
    
}