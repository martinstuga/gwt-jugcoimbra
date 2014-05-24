package pt.jug.cbr.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.PasswordTextBox;

public class Login extends Composite {

	private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);
	@UiField
	TextBox txtUsername;
	
	@UiField
	PasswordTextBox txtPassword;

	interface LoginUiBinder extends UiBinder<Widget, Login> {
	}

	public Login() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setUsernameValue(String user) {
		txtUsername.setValue(user);
	}

}
