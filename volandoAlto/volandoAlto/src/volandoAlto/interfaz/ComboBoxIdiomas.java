
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import volandoAlto.dominio.VolandoAlto;

/*
 * CustomComboBoxDemo.java is a 1.4 application that uses the following files:
 *   images/Bird.gif
 *   images/Cat.gif
 *   images/Dog.gif
 *   images/Rabbit.gif
 *   images/Pig.gif
 */
public class ComboBoxIdiomas extends JPanel {

    ImageIcon[] imagenes;
    String[] nombreIdiomas;
    VolandoAlto volandoAlto;

    public ComboBoxIdiomas(VolandoAlto volandoAlto) throws Exception {
        super(new BorderLayout());

        this.volandoAlto = volandoAlto;
        //Cargar las imágenes de los idiomas y crear un array de indices.
        imagenes = new ImageIcon[nombreIdiomas.length];
        Integer[] intArray = new Integer[nombreIdiomas.length];
        for (int i = 0; i < nombreIdiomas.length; i++) {
            intArray[i] = new Integer(i);
            imagenes[i] = createImageIcon("imges/" + nombreIdiomas[i] + ".png");
            if (imagenes[i] != null) {
                imagenes[i].setDescription(nombreIdiomas[i]);
            }
        }

        //Crear el comboBox
        JComboBox listaIdiomas = new JComboBox(intArray);
        ComboBoxRenderer renderer = new ComboBoxRenderer();
        renderer.setPreferredSize(new Dimension(200, 130));
        listaIdiomas.setRenderer(renderer);
        listaIdiomas.setMaximumRowCount(3);

        add(listaIdiomas, BorderLayout.PAGE_START);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path) throws Exception {
        java.net.URL imgURL = ComboBoxIdiomas.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            throw new Exception();
//            System.err.println("Couldn't find file: " + path);
//            return null;
        }
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    class ComboBoxRenderer extends JLabel
            implements ListCellRenderer {

        private Font uhOhFont;

        public ComboBoxRenderer() {
            setOpaque(true);
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);
        }

        /*
         * This method finds the image and text corresponding
         * to the selected value and returns the label, set up
         * to display the text and image.
         */
        public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
            //Get the selected index. (The index param isn't
            //always valid, so just use the value.)
            int selectedIndex = ((Integer) value).intValue();

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            //Set the icon and text.  If icon was null, say so.
            ImageIcon icon = imagenes[selectedIndex];
            String idioma = nombreIdiomas[selectedIndex];
            setIcon(icon);
            if (icon != null) {
                setText(idioma);
                setFont(list.getFont());
            } else {
                setUhOhText(idioma + " (no image available)",
                        list.getFont());
            }

            return this;
        }

        //Set the font and text when no image was found.
        protected void setUhOhText(String uhOhText, Font normalFont) {
            if (uhOhFont == null) { //lazily create this font
                uhOhFont = normalFont.deriveFont(Font.ITALIC);
            }
            setFont(uhOhFont);
            setText(uhOhText);
        }
    }
}
