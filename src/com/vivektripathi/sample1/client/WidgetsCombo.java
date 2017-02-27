package com.vivektripathi.sample1.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class WidgetsCombo extends Composite {

	private static WidgetsComboUiBinder uiBinder = GWT.create(WidgetsComboUiBinder.class);

	interface WidgetsComboUiBinder extends UiBinder<Widget, WidgetsCombo> {
	}

	public WidgetsCombo() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
