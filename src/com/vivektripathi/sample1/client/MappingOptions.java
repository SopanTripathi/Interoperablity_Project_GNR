package com.vivektripathi.sample1.client;

import org.gwtopenmaps.openlayers.client.MapOptions;
import org.gwtopenmaps.openlayers.client.util.JObjectArray;
import org.gwtopenmaps.openlayers.client.util.JSObject;

public class MappingOptions {

	public MapOptions setMapOptions() {
		MapOptions mapoptions = new MapOptions();
		
		mapoptions.setControls(new JObjectArray(new JSObject[] {})); //DetailS
		mapoptions.setNumZoomLevels(10);
		mapoptions.setProjection("EPSG:4326");
		return mapoptions;
	}

}
