package view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

/**
 * AppInterfaceFont
 */
public class AppFonts {
	private Font font, fontSizeSmall, fontSizeBig, fontButtom;

	public AppFonts() {
		// Se crea la fuente
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("../resources/lightsider.ttf"));
		} catch (FontFormatException | IOException e)  {
			e.printStackTrace();
		}

		fontSizeSmall = font.deriveFont(Font.PLAIN, 16);
		fontSizeBig = font.deriveFont(Font.PLAIN, 28);
		fontButtom = font.deriveFont(Font.PLAIN, 22);
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