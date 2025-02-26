package org.wicketstuff.jquery.ui.samples.data;

import java.time.LocalDate;
import java.util.List;

import org.wicketstuff.jquery.ui.calendar.CalendarEvent;
import org.wicketstuff.jquery.ui.calendar.CalendarModel;
import org.wicketstuff.jquery.ui.calendar.ICalendarVisitor;
import org.wicketstuff.jquery.ui.samples.data.dao.CalendarDAO;

public class DemoCalendarModel extends CalendarModel implements ICalendarVisitor
{
	private static final long serialVersionUID = 1L;

	@Override
	protected List<DemoCalendarEvent> load()
	{
		 LocalDate start = this.getStart();
		 LocalDate end = this.getEnd();
		
		return CalendarDAO.getEvents(start, end);
	}

	// ICalendarVisitor //
	@Override
	public void visit(CalendarEvent event)
	{
		//you can set additional properties to each event retrieved by #load() here
	}
}
