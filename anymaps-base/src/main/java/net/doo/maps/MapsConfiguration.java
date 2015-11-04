/*
 * Copyright (c) 2015 Daimler AG / Moovel GmbH
 *
 * All rights reserved
 */

package net.doo.maps;

import android.content.Context;

import java.util.Set;

/**
 * A util class for initializing the map and retrieving its capabilities.
 */
public interface MapsConfiguration {

	/**
	 * Initializes the maps.
	 *
	 * @param context the context
	 */
	void initialize(Context context);

	/**
	 * Provides capabilities of the {@link AnyMap} implementation. If some features are not supported
	 * and you will try to call them - nothing will happen.
	 *
	 * @return capabilities of the {@link AnyMap} implementation.
	 */
	Set<AnyMap.Configuration> getConfigurations();
}
