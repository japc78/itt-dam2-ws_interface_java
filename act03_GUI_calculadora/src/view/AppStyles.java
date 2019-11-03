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
	private Font font, fontButtom;
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
		 * @return the fontSizeSmall
		 */
		public Font getFontSizeSmall() {
			return fontSizeSmall;
		}

		/**
		 * @return the fontSizeBig
		 */
		public Font getFontSizeBig() {
			return fontSizeBig;
		}

		/**
		 * @return the fontButtom
		 */
		public Font getFontButtom() {
			return fontButtom;
		}

}