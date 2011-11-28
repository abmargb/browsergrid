package org.ourgrid.browser.client;

import java.util.List;

import org.ourgrid.browser.shared.Execution;
import org.ourgrid.browser.shared.ResultFile;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface WorkerServiceAsync {
	
	void getExecution(AsyncCallback<Execution> callback);

	void sendResults(Execution execution, List<ResultFile> outputs,
			AsyncCallback<Void> callback);
	
}
