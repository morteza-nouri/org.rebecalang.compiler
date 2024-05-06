package org.rebecalang.compiler.modelcompiler.timedrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;

public class TimedRebecaLabelUtility {
	public final static Label DELAY;
	public static final Label TIMED_VARIABLE;
	public static final Label MAILBOX;
	public static final Label KNOWNSENDER_VARIABLE;
	public static final Label AGGREGATION_ORDERSPEC;


	static {
		DELAY = new Label();
		DELAY.setName("delay");
		TIMED_VARIABLE = new Label();
		TIMED_VARIABLE.setName("timed-variable");
		MAILBOX = new Label();
		MAILBOX.setName("mailbox");
		KNOWNSENDER_VARIABLE = new Label();
		KNOWNSENDER_VARIABLE.setName("known-sender");
		AGGREGATION_ORDERSPEC = new Label();
		AGGREGATION_ORDERSPEC.setName("aggregation-order-spec");
	}
}
