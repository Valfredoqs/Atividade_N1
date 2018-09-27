package br.senai.fatesg.atividade_n1;

import javax.servlet.jsp.jstl.fmt.LocalizationContext;

import org.hibernate.ejb.criteria.expression.function.CurrentTimeFunction;

public class ClassePrincipal {
	
	private String horario;

	public static void main(String[] args) {
	
		
		public String getHorario() {
			return LocalizationContext;
		}
		
		ImagePlus imp = IJ.openImage("/Users/Valfredo/Desktop/senaigo.jpg");
		ImageProcessor ip = imp.getProcessor();
		ip.setColor(Color.YELLOW);
		ip.setLineWidth(4);
		ip.drawRect(10, 10, imp.getWidth() - 20, imp.getHeight() - 20);
		imp.show();
		
		
		

		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime.toString());
		return currentTime;
	}

	private static void getHorario() {
		// TODO Auto-generated method stub
		
	}
}

