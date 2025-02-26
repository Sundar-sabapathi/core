package org.wicketstuff.jquery.ui.samples.jqueryui.draggable;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.wicketstuff.jquery.core.resource.StyleSheetPackageHeaderItem;
import org.wicketstuff.jquery.ui.interaction.draggable.DraggableAdapter;
import org.wicketstuff.jquery.ui.interaction.draggable.DraggableBehavior;

public class DefaultDraggablePage extends AbstractDraggablePage
{
	private static final long serialVersionUID = 1L;

	public DefaultDraggablePage()
	{
		WebMarkupContainer container = new WebMarkupContainer("draggable");
		container.add(this.newDraggableBehavior());
		this.add(container);
	}

	// Methods //

	@Override
	public void renderHead(IHeaderResponse response)
	{
		super.renderHead(response);

		response.render(new StyleSheetPackageHeaderItem(DefaultDraggablePage.class));
	}

	// Factories //

	private DraggableBehavior newDraggableBehavior()
	{
		return new DraggableBehavior(new DraggableAdapter());
	}
}
