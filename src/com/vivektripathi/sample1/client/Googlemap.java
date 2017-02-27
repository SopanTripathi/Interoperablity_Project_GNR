package com.vivektripathi.sample1.client;

import org.gwtopenmaps.openlayers.client.layer.GoogleV3;
import org.gwtopenmaps.openlayers.client.layer.GoogleV3MapType;
import org.gwtopenmaps.openlayers.client.layer.GoogleV3Options;

public class Googlemap {

	public GoogleV3 getGoogleMapLayer() {
		GoogleV3Options googleoptions = new GoogleV3Options();
		googleoptions.setIsBaseLayer(true);
		googleoptions.setType(GoogleV3MapType.G_HYBRID_MAP);
        GoogleV3 hybrid3rdmap = new GoogleV3("Google Normal", googleoptions);
        return hybrid3rdmap;
	}

}
