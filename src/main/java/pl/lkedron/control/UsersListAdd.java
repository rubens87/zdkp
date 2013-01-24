package pl.lkedron.control;

import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.*;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Vlayout;
import org.zkoss.zul.Window;

public class UsersListAdd extends SelectorComposer<Window> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Wire
	Textbox input;
	@Wire
	Vlayout result;
	
	@Listen("onClick=#addUser")
	public void submit(Event event) {
		String prop = System.getProperty(input.getValue());
		System.out.println(prop);
		result.appendChild(new Label(prop));
	}
	
}
