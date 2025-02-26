package org.wicketstuff.jquery.ui.samples.kendoui.datetimepicker.local;

import java.time.LocalDate;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.wicketstuff.kendo.ui.form.button.AjaxButton;
import org.wicketstuff.kendo.ui.form.button.Button;
import org.wicketstuff.kendo.ui.form.datetime.local.DatePicker;
import org.wicketstuff.kendo.ui.panel.KendoFeedbackPanel;

public class LocalDatePickerPage extends AbstractTimePickerPage
{
	private static final long serialVersionUID = 1L;

	public LocalDatePickerPage()
	{
		final Form<?> form = new Form<Void>("form");
		this.add(form);

		// FeedbackPanel //
		final KendoFeedbackPanel feedback = new KendoFeedbackPanel("feedback");
		form.add(feedback);

		// Date Picker //
		final DatePicker datepicker = new DatePicker("datepicker", Model.of(LocalDate.now()));
		form.add(datepicker);

		// Buttons //
		form.add(new Button("submit") {

			private static final long serialVersionUID = 1L;

			@Override
			public void onSubmit()
			{
				this.info("Submitted: " + datepicker.getModelObject());
			}
		});

		form.add(new AjaxButton("button") {

			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit(AjaxRequestTarget target)
			{
				this.info("Submitted: " + datepicker.getModelObject());
				target.add(form);
			}

			@Override
			protected void onError(AjaxRequestTarget target)
			{
				target.add(feedback);
			}
		});
	}
}
