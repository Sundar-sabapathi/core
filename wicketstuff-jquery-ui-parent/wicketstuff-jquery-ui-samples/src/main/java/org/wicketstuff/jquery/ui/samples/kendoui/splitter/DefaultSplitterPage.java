package org.wicketstuff.jquery.ui.samples.kendoui.splitter;

import org.wicketstuff.kendo.ui.widget.splitter.SplitterAdapter;
import org.wicketstuff.kendo.ui.widget.splitter.SplitterBehavior;

public class DefaultSplitterPage extends AbstractSplitterPage
{
	private static final long serialVersionUID = 1L;
	
	public DefaultSplitterPage()
	{
		this.add(new SplitterBehavior("#splitter", new SplitterAdapter()));
	}
}
