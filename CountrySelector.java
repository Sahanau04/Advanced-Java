package D4;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;
public class CountrySelector extends JFrame {

	    private JList<String> countryList;

	    public CountrySelector() {
	        // Set up frame
	        setTitle("Country Selector");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the frame

	        // Country array
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada",
	            "Denmark", "France", "Great Britain", "Japan",
	            "Africa", "Greenland", "Singapore"
	        };

	        // Create JList
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selectedCountries = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries:");
	                    for (String country : selectedCountries) {
	                        System.out.println("- " + country);
	                    }
	                }
	            }
	        });

	        // Add to ScrollPane and then to Frame
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        add(scrollPane, BorderLayout.CENTER);
	    }

	    public static void main(String[] args) {
	        // Run GUI in the Event Dispatch Thread
	        SwingUtilities.invokeLater(() -> {
	            new CountrySelector().setVisible(true);
	        });
	    }
}
