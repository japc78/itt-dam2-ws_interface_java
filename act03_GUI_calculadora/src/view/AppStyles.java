package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 * AppInterfaceFont
 */
public class AppStyles {
	private Font font, fontButtom, fontScreen;
	Color color1, colorTxt;
	Border border1, borderPadding, empyBorder;


	public AppStyles() {
		// Fuente
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("../resources/lightsider.ttf"));
		} catch (FontFormatException | IOException e)  {
			e.printStackTrace();
		}
		fontButtom = font.deriveFont(Font.PLAIN, 22);
		fontScreen = font.deriveFont(Font.PLAIN, 24);
		// Colores
		colorTxt = new Color(0, 0, 0);
		color1 = new Color(75, 215, 200);

		// Borders
		border1 = BorderFactory.createLineBorder(Color.BLACK, 3);
		borderPadding = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		empyBorder = BorderFactory.createEmptyBorder(2, 2, 2, 2);
	}

	// Getters
		/**
		 * @return the font
		 */
		public Font getFont() {
			return font;
		}

		/**
		 * @return the fontButtom
		 */
		public Font getFontButtom() {
			return fontButtom;
		}

		/**
		 * @return the fontButtom
		 */
		public Font getFontScreen() {
			return fontScreen;
		}

	/**
	 * @return the color1
	 */
	public Color getColor1() {
		return color1;
	}

	/**
	 * @param color1 the color1 to set
	 */
	public void setColor1(Color color1) {
		this.color1 = color1;
	}

	/**
	 * @return the colorTxt
	 */
	public Color getColorTxt() {
		return colorTxt;
	}

	/**
	 * @param colorTxt the colorTxt to set
	 */
	public void setColorTxt(Color colorTxt) {
		this.colorTxt = colorTxt;
	}

	/**
	 * @return the border1
	 */
	public Border getBorder1() {
		return border1;
	}

	/**
	 * @param border1 the border1 to set
	 */
	public void setBorder1(Border border1) {
		this.border1 = border1;
	}

	/**
	 * @return the borderPadding
	 */
	public Border getBorderPadding() {
		return borderPadding;
	}

	/**
	 * @param borderPadding the borderPadding to set
	 */
	public void setBorderPadding(Border borderPadding) {
		this.borderPadding = borderPadding;
	}

	/**
	 * @return the empyBorder
	 */
	public Border getEmpyBorder() {
		return empyBorder;
	}

	/**
	 * @param empyBorder the empyBorder to set
	 */
	public void setEmpyBorder(Border empyBorder) {
		this.empyBorder = empyBorder;
	}

}