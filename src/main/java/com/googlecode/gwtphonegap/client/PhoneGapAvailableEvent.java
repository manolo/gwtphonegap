/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtphonegap.client;

import com.google.gwt.event.shared.GwtEvent;

/**
 * This event is fired after PhoneGap is initialized successfully and is ready
 * for usage
 * 
 * @author Daniel Kurka
 * 
 */
public class PhoneGapAvailableEvent extends GwtEvent<PhoneGapAvailableHandler> {

	public static final GwtEvent.Type<PhoneGapAvailableHandler> TYPE = new GwtEvent.Type<PhoneGapAvailableHandler>();

	public PhoneGapAvailableEvent() {

	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<PhoneGapAvailableHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(PhoneGapAvailableHandler handler) {
		handler.onPhoneGapAvailable(this);

	}

}
