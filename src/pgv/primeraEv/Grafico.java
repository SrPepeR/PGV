package pgv.primeraEv;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafico {
	
	static void hacerGrafico(int[] datos) {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for( int i = 0; i < datos.length; i++ ) {
			dataset.addValue(datos[i], "Fila " + i, "Columna " + i);
		}
		
		JFreeChart chart = ChartFactory.createBarChart(
				  "GRAFICO",
				  "POSICION",
				  "CANTIDAD",
				  dataset,
				  PlotOrientation.VERTICAL,
				  true,
				  true,
				  true
				);
		
		ChartPanel chartPanel = new ChartPanel(chart, false);
		frame.setContentPane(chartPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
}
