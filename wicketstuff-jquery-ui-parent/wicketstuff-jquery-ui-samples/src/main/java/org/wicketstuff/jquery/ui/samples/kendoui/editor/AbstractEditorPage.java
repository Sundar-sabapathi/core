package org.wicketstuff.jquery.ui.samples.kendoui.editor;

import java.util.Arrays;
import java.util.List;

import org.wicketstuff.jquery.ui.samples.KendoSamplePage;

abstract class AbstractEditorPage extends KendoSamplePage
{
	private static final long serialVersionUID = 1L;

	@Override
	protected List<DemoLink> getDemoLinks()
	{
		return Arrays.asList(// lf
				new DemoLink(DefaultEditorPage.class, "Editor")// lf
		);
	}
}
