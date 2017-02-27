package com.vivektripathi.sample1.client;

//Libraries for open layers
import org.gwtopenmaps.openlayers.client.LonLat;
import org.gwtopenmaps.openlayers.client.Map;
import org.gwtopenmaps.openlayers.client.MapOptions;
import org.gwtopenmaps.openlayers.client.MapWidget;
import org.gwtopenmaps.openlayers.client.Projection;
import org.gwtopenmaps.openlayers.client.layer.GoogleV3;
import org.gwtopenmaps.openlayers.client.layer.OSM;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainActivity implements EntryPoint {


	//Map map; //default type
	//MapWidget mapwid;
	//private String projection;
	
	private static final Projection DEFAULT_PROJECTION = new Projection("EPSG:4326");
	private VerticalPanel vPanel = new VerticalPanel();
	private HorizontalPanel hPanel = new HorizontalPanel();
	Button b1;
	ListBox list1;
	Label label1;
	private Map map;
	
	public void onModuleLoad() {
	
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
		
		//int i =l1.getSelectedIndex();
		//System.out.println(i);

		//Button Addition
		this.b1= new Button("Get Capablity");
		vPanel.add(b1);
		b1.setEnabled(false);
		b1.setStyleName("gwt-button");
		//b1.addStyleName(""); 
		//b1.addClickHandler(new B1Handler());

		DecoratorPanel decoratorPanel = new DecoratorPanel();
	    decoratorPanel.add(vPanel);  
	    
	    
	    
	
	    
	    RootPanel.get("centralsection").add(decoratorPanel);



		//Label for Data Streaming
		//this.label2 = new Label("Streaming Data From:");
		//label2.setStyleName("streamingdata");
		//vPanel.add(label1);
		
		
		
		
		//Instantiate JavaClass without UIBinder
		//PageOne elem1 = new PageOne();
		//RootPanel.get().add(elem1);
		
		//Instantiate JavaClass with UIBinder
		WidgetsCombo elem2 = new WidgetsCombo();
		RootPanel.get().add(elem2);
		
		
		
		
		// lets create map widget and map objects
 /*       mapwid = new MapWidget("100%","623px", new MappingOptions().setMapOptions());
        map = mapwid.getMap();
        
        // adding google Base Map layer on map
        GoogleV3 googleMapLayer = new Googlemap().getGoogleMapLayer();
        map.addLayer(googleMapLayer);
        googleMapLayer.setIsVisible(true);	*/
        
        
		//Adding Labels in RootPanel
		//l is Parent of all Elements
		MapOptions defaultMapOptions = new MapOptions();
		MapWidget mapWidget = new MapWidget("500px", "500px", defaultMapOptions);
		mapWidget.setStyleName("centralsection");
		//mapWidget.addStyleName("centralsection");
		map = mapWidget.getMap();
		
		GoogleV3 googlenormal = new Googlemap().getGoogleMapLayer();
		map.addLayer(googlenormal);
		googlenormal.setIsVisible(true);
		LonLat lonLat = new LonLat(6.95, 50.94);
		lonLat.transform(DEFAULT_PROJECTION.getProjectionCode(),map.getProjection()); 
		map.setCenter(lonLat, 7);
	
		
		
		lonLat.transform("EPSG:4326", mapWidget.getMap().getProjection()); //transform lonlat (provided in EPSG:4326) to OSM coordinate system (the map projection)
		mapWidget.getMap().setCenter(lonLat, 12);
		
		hPanel.add(mapWidget);
		vPanel.add(hPanel);
		//RootPanel.get().add(mapWidget);

	}

}
