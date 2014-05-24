package pt.jug.cbr.client.bck;

import com.google.gwt.user.client.ui.TextBox;

public class MyTextBox extends TextBox {
	
	public void setPlaceHolder(String placeHolder)
	{
		getElement().setPropertyString("placeholder", placeHolder);
	}

}
