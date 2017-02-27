package com.vivektripathi.sample1.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

//Composite is class which is used to make GUI component in GWT
public class PageOne extends Composite{

	public PageOne()
	{	
		initWidget(this.vPanel);
		setwidgets();
	}

	private VerticalPanel vPanel = new VerticalPanel();
	Button b1;
	ListBox list1;
	Label label1;


	private void setwidgets() {
		vPanel.setSpacing(5);
		vPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		//vPanel.setSize("300", "100");

		//Setting Up the Label:
		this.label1 = new Label("Parameter Setting Window");
		vPanel.add(label1);
		label1.addStyleName("gwt-h1");
		vPanel.add(label1);
		
		
		// Adding ListBox with Multiple Selection =False
		this.list1 = new ListBox(false);
		list1.addItem("Select Service");
		list1.addItem("LocalServer : GeoServer");
		list1.addItem("RemoteServer : ISRIC ");
		vPanel.add(list1);
		

		//Button Addition
		this.b1= new Button("Get Capablity");
		vPanel.add(b1);
		b1.setEnabled(false);
		//b1.setStyleName("button", true); 
		//b1.addClickHandler(new B1Handler());

		DecoratorPanel decoratorPanel = new DecoratorPanel();
	    decoratorPanel.add(vPanel);  
	    RootPanel.get("centralsection").add(decoratorPanel);
	}

}