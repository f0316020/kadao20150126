package graph;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class Graph_view extends Frame implements ActionListener,WindowListener
 {
	public Graph_view(){
	addWindowListener(this);
	setTitle("Graph");
	
	DefaultCategoryDataset data = new DefaultCategoryDataset();
    data.addValue(300, "USA", "2005年");
    data.addValue(500, "USA", "2006年");
    data.addValue(120, "USA", "2007年");

    data.addValue(200, "China", "2005年");
    data.addValue(400, "China", "2006年");
    data.addValue(320, "China", "2007年");


    JFreeChart chart = 
      ChartFactory.createLineChart("inport",
                                   "th",
                                   "ton(t)",
                                   data,
                                   PlotOrientation.VERTICAL,
                                   true,
                                   false,
                                   false);

    ChartPanel cpanel = new ChartPanel(chart);
    add(cpanel, BorderLayout.CENTER);
  }


	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 

}
