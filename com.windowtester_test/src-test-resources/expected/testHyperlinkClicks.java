/*******************************************************************************
 *  Copyright (c) 2012 Google, Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Google, Inc. - initial API and implementation
 *******************************************************************************/
package expected;

import com.windowtester.runtime.swt.UITestCaseSWT;
import com.windowtester.runtime.swt.locator.forms.HyperlinkLocator;
import com.windowtester.runtime.IUIContext;

public class testHyperlinkClicks extends UITestCaseSWT {

	/**
	 * Main test method.
	 */
	public void testtestHyperlinkClicks() throws Exception {
		IUIContext ui = getUI();
		ui.click(new HyperlinkLocator("http://www.instantiations.com")
				.inSection("Section"));
	}

}